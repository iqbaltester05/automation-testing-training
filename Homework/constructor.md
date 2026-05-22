# Constructor Chaining Homework & Practice Programs

This homework is designed for:

* beginner → intermediate
* confidence building
* automation framework mindset
* interview preparation

Do NOT copy-paste directly.
Type manually and run.

---

# Level 1 — Basic Constructor Practice

---

# Program 1 — Default Constructor

Create a class:

<pre class="overflow-visible! px-0!" data-start="344" data-end="378"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Bike</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Requirements:

* create default constructor
* print:
  * Bike created
* create object in main method

Expected Output:

<pre class="overflow-visible! px-0!" data-start="499" data-end="535"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="relative"><div class="pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span>Bike created</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 2 — Parameterized Constructor

Create:

<pre class="overflow-visible! px-0!" data-start="592" data-end="630"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Employee</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Requirements:

* constructor should accept:
  * name
  * age
* print both values

Example:

<pre class="overflow-visible! px-0!" data-start="723" data-end="773"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">new</span><span></span><span class="ͼ11">Employee</span><span>(</span><span class="ͼz">"Iqbal"</span><span>, </span><span class="ͼy">25</span><span>);</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 3 — Multiple Constructors

Create:

<pre class="overflow-visible! px-0!" data-start="826" data-end="862"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Mobile</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Create 3 constructors:

1. no argument
2. one argument → brand
3. two arguments → brand + price

Print different messages from each constructor.

---

# Level 2 — Understanding** **`this`

---

# Program 4 — Solve Shadowing Problem

Create:

<pre class="overflow-visible! px-0!" data-start="1101" data-end="1138"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Student</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Variables:

* name
* age

Constructor parameters:

* name
* age

Use:

<pre class="overflow-visible! px-0!" data-start="1209" data-end="1251"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼy">this</span><span class="ͼv">.</span><span class="ͼ11">name</span><br/><span class="ͼy">this</span><span class="ͼv">.</span><span class="ͼ11">age</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Create display method.

---

# Expected Understanding

Why this is wrong:

<pre class="overflow-visible! px-0!" data-start="1328" data-end="1364"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼ11">name</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">name</span><span>;</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

And why this is correct:

<pre class="overflow-visible! px-0!" data-start="1392" data-end="1433"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼy">this</span><span class="ͼv">.</span><span class="ͼ11">name</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">name</span><span>;</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 5 — Current Object Reference

Create:

* 2 methods
* print current object using:

<pre class="overflow-visible! px-0!" data-start="1531" data-end="1580"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼy">this</span><span>);</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Print object reference from:

* constructor
* method

Understand:

* same object reference

---

# Level 3 — Constructor Chaining with** **`this()`

---

# Program 6 — Basic Chaining

Create:

<pre class="overflow-visible! px-0!" data-start="1769" data-end="1805"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Laptop</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Requirements:

* default constructor calls one argument constructor
* one argument constructor prints brand

Expected Flow:

<pre class="overflow-visible! px-0!" data-start="1931" data-end="1992"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="relative"><div class="pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span>Default Constructor</span><br/><span>Brand Constructor</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 7 — Multi-Level Chaining

Create:

<pre class="overflow-visible! px-0!" data-start="2044" data-end="2085"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">BankAccount</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Constructors:

1. no argument
2. name
3. name + balance
4. name + balance + branch

Chain all constructors using:

<pre class="overflow-visible! px-0!" data-start="2201" data-end="2231"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼy">this</span><span>()</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Final constructor should initialize variables.

Create display method.

---

# Goal

Understand:

* constructor flow
* execution order
* centralized initialization

---

# Program 8 — Smart Calculator

Create constructors:

1. default → calls addition constructor
2. one value
3. two values

Print:

* addition
* subtraction
* multiplication

Use constructor chaining.

---

# Level 4 —** **`super()` and Inheritance

---

# Program 9 — Parent Constructor Call

Create:

<pre class="overflow-visible! px-0!" data-start="2697" data-end="2733"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Animal</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

and

<pre class="overflow-visible! px-0!" data-start="2740" data-end="2773"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Dog</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Requirements:

* parent constructor prints:
  * Animal created
* child constructor prints:
  * Dog created

Observe execution order.

---

# Program 10 — Parameterized** **`super()`

Create:

<pre class="overflow-visible! px-0!" data-start="2962" data-end="2999"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Vehicle</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Constructor:

* accepts vehicleName

Child:

<pre class="overflow-visible! px-0!" data-start="3045" data-end="3078"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Car</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Constructor:

* accepts vehicleName + price

Use:

<pre class="overflow-visible! px-0!" data-start="3130" data-end="3173"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">super</span><span>(</span><span class="ͼ11">vehicleName</span><span>);</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 11 — Multi-Level Inheritance

Create:

* GrandParent
* Parent
* Child

All constructors should print messages.

Create object of Child.

Observe constructor chain flow.

---

# Expected Output Order

<pre class="overflow-visible! px-0!" data-start="3389" data-end="3437"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="relative"><div class="pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span>GrandParent</span><br/><span>Parent</span><br/><span>Child</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Level 5 — Real-Time Framework Programs

---

# Program 12 — Selenium Base Page Simulation

Create:

<pre class="overflow-visible! px-0!" data-start="3546" data-end="3584"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">BasePage</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Variable:

<pre class="overflow-visible! px-0!" data-start="3597" data-end="3635"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼ11">String</span><span></span><span class="ͼ11">driver</span><span>;</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Constructor:

* accepts driver

---

Create:

<pre class="overflow-visible! px-0!" data-start="3682" data-end="3738"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">LoginPage</span><span></span><span class="ͼv">extends</span><span></span><span class="ͼ11">BasePage</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Use:

<pre class="overflow-visible! px-0!" data-start="3746" data-end="3784"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">super</span><span>(</span><span class="ͼ11">driver</span><span>);</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Print:

* LoginPage initialized

---

# Goal

Understand real Selenium architecture.

---

# Program 13 — Appium Framework Simulation

Create:

* BaseTest
* AndroidTest
* IOS_Test

Pass:

* platform name
* device name

Use constructor chaining.

---

# Program 14 — API Framework Simulation

Create:

* BaseAPI
* UserAPI
* PaymentAPI

Pass:

* baseURL
* token

Use:

* `super()`
* inheritance

---

# Level 6 — Error Practice (VERY IMPORTANT)

---

# Program 15 —** **`this()` on Second Line

Write:

<pre class="overflow-visible! px-0!" data-start="4277" data-end="4418"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Test</span><span> {</span><br/><br/><span></span><span class="ͼ11">Test</span><span>() {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Hello"</span><span>);</span><br/><br/><span></span><span class="ͼy">this</span><span>(</span><span class="ͼy">10</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼ11">Test</span><span>(</span><span class="ͼ11">int</span><span></span><span class="ͼ11">a</span><span>) {</span><br/><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Observe compile error.

Write answer:
WHY Java gives error?

---

# Program 16 —** **`super()` on Second Line

Create parent-child classes.

Put:

<pre class="overflow-visible! px-0!" data-start="4563" data-end="4595"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">super</span><span>();</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

on second line.

Observe error.

---

# Program 17 — Recursive Constructor

Write:

<pre class="overflow-visible! px-0!" data-start="4681" data-end="4758"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼ11">Test</span><span>() {</span><br/><span></span><span class="ͼy">this</span><span>(</span><span class="ͼy">10</span><span>);</span><br/><span>}</span><br/><br/><span class="ͼ11">Test</span><span>(</span><span class="ͼ11">int</span><span> a) {</span><br/><span></span><span class="ͼy">this</span><span>();</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Observe:

* compilation behavior
* runtime behavior

Understand recursion danger.

---

# Program 18 — Multiple** **`super()`

Try:

<pre class="overflow-visible! px-0!" data-start="4888" data-end="4929"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">super</span><span>();</span><br/><span class="ͼv">super</span><span>();</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Observe compile error.

Write WHY.

---

# Level 7 — Interview Confidence Programs

---

# Program 19 — Private Constructor

Create:

<pre class="overflow-visible! px-0!" data-start="5065" data-end="5104"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Singleton</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Requirements:

* private constructor
* static method returns object

Understand:

* singleton design pattern

---

# Program 20 — Constructor Counter

Count how many objects are created.

Hint:
Use:

<pre class="overflow-visible! px-0!" data-start="5304" data-end="5345"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">static</span><span></span><span class="ͼ11">int</span><span></span><span class="ͼ11">count</span><span>;</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Increment inside constructor.

---

# Program 21 — Constructor Flow Prediction

Predict output BEFORE running.

<pre class="overflow-visible! px-0!" data-start="5459" data-end="5763"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">A</span><span> {</span><br/><br/><span></span><span class="ͼ11">A</span><span>() {</span><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"A"</span><span>);</span><br/><span>    }</span><br/><span>}</span><br/><br/><span class="ͼv">class</span><span></span><span class="ͼ11">B</span><span></span><span class="ͼv">extends</span><span></span><span class="ͼ11">A</span><span> {</span><br/><br/><span></span><span class="ͼ11">B</span><span>() {</span><br/><span></span><span class="ͼy">this</span><span>(</span><span class="ͼy">10</span><span>);</span><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"B"</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼ11">B</span><span>(</span><span class="ͼ11">int</span><span></span><span class="ͼ11">a</span><span>) {</span><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"B int"</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">B</span><span>();</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 22 — Advanced Chaining

Create ecommerce system:

Classes:

* Product
* Electronics
* MobilePhone

Pass:

* productId
* brand
* price
* RAM
* storage

Use:

* constructor chaining
* inheritance
* super()
* this()

---

# Level 8 — Automation Engineer Special Homework

---

# Homework 1 — Build Tiny Selenium Framework Structure

Create:

* BaseTest
* BasePage
* LoginPage
* DashboardPage

Requirements:

* use constructors properly
* pass driver everywhere
* use super()

---

# Homework 2 — Build Mini PageFactory Simulation

Store:

* driver
* wait
* logger

in BasePage.

Reuse in child pages.

---

# Homework 3 — Framework Refactoring

Create BAD framework:

* duplicate driver initialization everywhere

Then REFACTOR using:

* constructor chaining
* inheritance

Understand WHY frameworks use this architecture.

---

# Important Practice Questions

Answer in notebook without IDE help.

---

# Q1

Why** **`this()` must be first line?

---

# Q2

Why** **`super()` must be first line?

---

# Q3

Can constructor be inherited?

---

# Q4

Can constructor be overridden?

---

# Q5

Difference between:

* `this`
* `this()`
* `super`
* `super()`

---

# Q6

What happens if parent constructor has parameterized constructor only?

---

# Q7

What happens if child constructor does not call** **`super()`?

---

# Q8

Why constructor chaining is heavily used in frameworks?

---

# Q9

What is the difference between object creation and constructor execution?


Mini Challenge (Most Important)

Build this complete structure:

<pre class="overflow-visible! px-0!" data-start="7394" data-end="7474"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="relative"><div class="pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span>Object</span><br/><span>   |</span><br/><span>Person</span><br/><span>   |</span><br/><span>Employee</span><br/><span>   |</span><br/><span>AutomationEngineer</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Requirements:

* use inheritance
* constructor chaining
* use this()
* use super()
* parameterized constructors
* display all values

This one program alone will build huge confidence.

---

# Golden Rule

If confused:

1. draw constructor flow
2. identify SAME class or PARENT class
3. decide:
   * `this()`
   * OR** **`super()`

Never both together.

# Constructor Chaining Practice Programs — Answers

---

# Program 1 — Default Constructor

<pre class="overflow-visible! px-0!" data-start="92" data-end="267"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Bike</span><span> {</span><br/><br/><span></span><span class="ͼ11">Bike</span><span>() {</span><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Bike created"</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">Bike</span><span>();</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 2 — Parameterized Constructor

<pre class="overflow-visible! px-0!" data-start="315" data-end="578"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Employee</span><span> {</span><br/><br/><span></span><span class="ͼ11">Employee</span><span>(</span><span class="ͼ11">String</span><span></span><span class="ͼ11">name</span><span>, </span><span class="ͼ11">int</span><span></span><span class="ͼ11">age</span><span>) {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Name: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">name</span><span>);</span><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Age: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">age</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">Employee</span><span>(</span><span class="ͼz">"Iqbal"</span><span>, </span><span class="ͼy">25</span><span>);</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 3 — Multiple Constructors

<pre class="overflow-visible! px-0!" data-start="622" data-end="1056"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Mobile</span><span> {</span><br/><br/><span></span><span class="ͼ11">Mobile</span><span>() {</span><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Default Constructor"</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼ11">Mobile</span><span>(</span><span class="ͼ11">String</span><span></span><span class="ͼ11">brand</span><span>) {</span><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Brand: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">brand</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼ11">Mobile</span><span>(</span><span class="ͼ11">String</span><span></span><span class="ͼ11">brand</span><span>, </span><span class="ͼ11">int</span><span></span><span class="ͼ11">price</span><span>) {</span><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼ11">brand</span><span></span><span class="ͼv">+</span><span></span><span class="ͼz">" "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">price</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">Mobile</span><span>();</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">Mobile</span><span>(</span><span class="ͼz">"Samsung"</span><span>);</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">Mobile</span><span>(</span><span class="ͼz">"iPhone"</span><span>, </span><span class="ͼy">100000</span><span>);</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 4 — Shadowing Problem

<pre class="overflow-visible! px-0!" data-start="1096" data-end="1479"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Student</span><span> {</span><br/><br/><span></span><span class="ͼ11">String</span><span></span><span class="ͼ11">name</span><span>;</span><br/><span></span><span class="ͼ11">int</span><span></span><span class="ͼ11">age</span><span>;</span><br/><br/><span></span><span class="ͼ11">Student</span><span>(</span><span class="ͼ11">String</span><span></span><span class="ͼ11">name</span><span>, </span><span class="ͼ11">int</span><span></span><span class="ͼ11">age</span><span>) {</span><br/><br/><span></span><span class="ͼy">this</span><span class="ͼv">.</span><span class="ͼ11">name</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">name</span><span>;</span><br/><span></span><span class="ͼy">this</span><span class="ͼv">.</span><span class="ͼ11">age</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">age</span><span>;</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">display</span><span>() {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼ11">name</span><span>);</span><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼ11">age</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼ11">Student</span><span></span><span class="ͼ11">s</span><span></span><span class="ͼv">=</span><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">Student</span><span>(</span><span class="ͼz">"Iqbal"</span><span>, </span><span class="ͼy">25</span><span>);</span><br/><br/><span></span><span class="ͼ11">s</span><span class="ͼv">.</span><span class="ͼ11">display</span><span>();</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Why** **`name = name` is wrong?

<pre class="overflow-visible! px-0!" data-start="1517" data-end="1553"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼ11">name</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">name</span><span>;</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Both variables refer to constructor parameter.

Instance variable never gets updated.

Correct:

<pre class="overflow-visible! px-0!" data-start="1652" data-end="1693"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼy">this</span><span class="ͼv">.</span><span class="ͼ11">name</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">name</span><span>;</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 5 — Current Object Reference

<pre class="overflow-visible! px-0!" data-start="1740" data-end="2039"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Test</span><span> {</span><br/><br/><span></span><span class="ͼ11">Test</span><span>() {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Constructor Object: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼy">this</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">show</span><span>() {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Method Object: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼy">this</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼ11">Test</span><span></span><span class="ͼ11">t</span><span></span><span class="ͼv">=</span><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">Test</span><span>();</span><br/><br/><span></span><span class="ͼ11">t</span><span class="ͼv">.</span><span class="ͼ11">show</span><span>();</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Observe:

* both print same object reference

---

# Program 6 — Basic Constructor Chaining

<pre class="overflow-visible! px-0!" data-start="2133" data-end="2439"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Laptop</span><span> {</span><br/><br/><span></span><span class="ͼ11">Laptop</span><span>() {</span><br/><br/><span></span><span class="ͼy">this</span><span>(</span><span class="ͼz">"Dell"</span><span>);</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Default Constructor"</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼ11">Laptop</span><span>(</span><span class="ͼ11">String</span><span></span><span class="ͼ11">brand</span><span>) {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Brand Constructor: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">brand</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">Laptop</span><span>();</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Output

<pre class="overflow-visible! px-0!" data-start="2456" data-end="2523"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="relative"><div class="pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span>Brand Constructor: Dell</span><br/><span>Default Constructor</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 7 — Multi-Level Constructor Chaining

<pre class="overflow-visible! px-0!" data-start="2578" data-end="3514"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">BankAccount</span><span> {</span><br/><br/><span></span><span class="ͼ11">String</span><span></span><span class="ͼ11">name</span><span>;</span><br/><span></span><span class="ͼ11">int</span><span></span><span class="ͼ11">balance</span><span>;</span><br/><span></span><span class="ͼ11">String</span><span></span><span class="ͼ11">branch</span><span>;</span><br/><br/><span></span><span class="ͼ11">BankAccount</span><span>() {</span><br/><br/><span></span><span class="ͼy">this</span><span>(</span><span class="ͼz">"Unknown"</span><span>);</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Default Constructor"</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼ11">BankAccount</span><span>(</span><span class="ͼ11">String</span><span></span><span class="ͼ11">name</span><span>) {</span><br/><br/><span></span><span class="ͼy">this</span><span>(</span><span class="ͼ11">name</span><span>, </span><span class="ͼy">0</span><span>);</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Single Argument Constructor"</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼ11">BankAccount</span><span>(</span><span class="ͼ11">String</span><span></span><span class="ͼ11">name</span><span>, </span><span class="ͼ11">int</span><span></span><span class="ͼ11">balance</span><span>) {</span><br/><br/><span></span><span class="ͼy">this</span><span>(</span><span class="ͼ11">name</span><span>, </span><span class="ͼ11">balance</span><span>, </span><span class="ͼz">"Bangalore"</span><span>);</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Two Argument Constructor"</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼ11">BankAccount</span><span>(</span><span class="ͼ11">String</span><span></span><span class="ͼ11">name</span><span>, </span><span class="ͼ11">int</span><span></span><span class="ͼ11">balance</span><span>, </span><span class="ͼ11">String</span><span></span><span class="ͼ11">branch</span><span>) {</span><br/><br/><span></span><span class="ͼy">this</span><span class="ͼv">.</span><span class="ͼ11">name</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">name</span><span>;</span><br/><span></span><span class="ͼy">this</span><span class="ͼv">.</span><span class="ͼ11">balance</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">balance</span><span>;</span><br/><span></span><span class="ͼy">this</span><span class="ͼv">.</span><span class="ͼ11">branch</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">branch</span><span>;</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Final Constructor"</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">display</span><span>() {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼ11">name</span><span>);</span><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼ11">balance</span><span>);</span><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼ11">branch</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼ11">BankAccount</span><span></span><span class="ͼ11">b</span><span></span><span class="ͼv">=</span><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">BankAccount</span><span>();</span><br/><br/><span></span><span class="ͼ11">b</span><span class="ͼv">.</span><span class="ͼ11">display</span><span>();</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 8 — Smart Calculator

<pre class="overflow-visible! px-0!" data-start="3553" data-end="4089"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Calculator</span><span> {</span><br/><br/><span></span><span class="ͼ11">Calculator</span><span>() {</span><br/><br/><span></span><span class="ͼy">this</span><span>(</span><span class="ͼy">10</span><span>);</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Default Constructor"</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼ11">Calculator</span><span>(</span><span class="ͼ11">int</span><span></span><span class="ͼ11">a</span><span>) {</span><br/><br/><span></span><span class="ͼy">this</span><span>(</span><span class="ͼ11">a</span><span>, </span><span class="ͼy">5</span><span>);</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Single Argument Constructor"</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼ11">Calculator</span><span>(</span><span class="ͼ11">int</span><span></span><span class="ͼ11">a</span><span>, </span><span class="ͼ11">int</span><span></span><span class="ͼ11">b</span><span>) {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Addition: "</span><span></span><span class="ͼv">+</span><span> (</span><span class="ͼ11">a</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">b</span><span>));</span><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Subtraction: "</span><span></span><span class="ͼv">+</span><span> (</span><span class="ͼ11">a</span><span></span><span class="ͼv">-</span><span></span><span class="ͼ11">b</span><span>));</span><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Multiplication: "</span><span></span><span class="ͼv">+</span><span> (</span><span class="ͼ11">a</span><span></span><span class="ͼv">*</span><span></span><span class="ͼ11">b</span><span>));</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">Calculator</span><span>();</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 9 — Parent Constructor Call

<pre class="overflow-visible! px-0!" data-start="4135" data-end="4409"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Animal</span><span> {</span><br/><br/><span></span><span class="ͼ11">Animal</span><span>() {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Animal created"</span><span>);</span><br/><span>    }</span><br/><span>}</span><br/><br/><span class="ͼv">class</span><span></span><span class="ͼ11">Dog</span><span></span><span class="ͼv">extends</span><span></span><span class="ͼ11">Animal</span><span> {</span><br/><br/><span></span><span class="ͼ11">Dog</span><span>() {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Dog created"</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">Dog</span><span>();</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Output

<pre class="overflow-visible! px-0!" data-start="4426" data-end="4476"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="relative"><div class="pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span>Animal created</span><br/><span>Dog created</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 10 — Parameterized** **`super()`

<pre class="overflow-visible! px-0!" data-start="4523" data-end="4903"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Vehicle</span><span> {</span><br/><br/><span></span><span class="ͼ11">Vehicle</span><span>(</span><span class="ͼ11">String</span><span></span><span class="ͼ11">vehicleName</span><span>) {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Vehicle: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">vehicleName</span><span>);</span><br/><span>    }</span><br/><span>}</span><br/><br/><span class="ͼv">class</span><span></span><span class="ͼ11">Car</span><span></span><span class="ͼv">extends</span><span></span><span class="ͼ11">Vehicle</span><span> {</span><br/><br/><span></span><span class="ͼ11">Car</span><span>(</span><span class="ͼ11">String</span><span></span><span class="ͼ11">vehicleName</span><span>, </span><span class="ͼ11">int</span><span></span><span class="ͼ11">price</span><span>) {</span><br/><br/><span></span><span class="ͼv">super</span><span>(</span><span class="ͼ11">vehicleName</span><span>);</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Price: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">price</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">Car</span><span>(</span><span class="ͼz">"BMW"</span><span>, </span><span class="ͼy">5000000</span><span>);</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 11 — Multi-Level Inheritance

<pre class="overflow-visible! px-0!" data-start="4950" data-end="5330"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">GrandParent</span><span> {</span><br/><br/><span></span><span class="ͼ11">GrandParent</span><span>() {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"GrandParent"</span><span>);</span><br/><span>    }</span><br/><span>}</span><br/><br/><span class="ͼv">class</span><span></span><span class="ͼ11">Parent</span><span></span><span class="ͼv">extends</span><span></span><span class="ͼ11">GrandParent</span><span> {</span><br/><br/><span></span><span class="ͼ11">Parent</span><span>() {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Parent"</span><span>);</span><br/><span>    }</span><br/><span>}</span><br/><br/><span class="ͼv">class</span><span></span><span class="ͼ11">Child</span><span></span><span class="ͼv">extends</span><span></span><span class="ͼ11">Parent</span><span> {</span><br/><br/><span></span><span class="ͼ11">Child</span><span>() {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Child"</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">Child</span><span>();</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Output

<pre class="overflow-visible! px-0!" data-start="5347" data-end="5395"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="relative"><div class="pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span>GrandParent</span><br/><span>Parent</span><br/><span>Child</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 12 — Selenium Base Page Simulation

<pre class="overflow-visible! px-0!" data-start="5448" data-end="5875"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">BasePage</span><span> {</span><br/><br/><span></span><span class="ͼ11">String</span><span></span><span class="ͼ11">driver</span><span>;</span><br/><br/><span></span><span class="ͼ11">BasePage</span><span>(</span><span class="ͼ11">String</span><span></span><span class="ͼ11">driver</span><span>) {</span><br/><br/><span></span><span class="ͼy">this</span><span class="ͼv">.</span><span class="ͼ11">driver</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">driver</span><span>;</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Driver initialized"</span><span>);</span><br/><span>    }</span><br/><span>}</span><br/><br/><span class="ͼv">class</span><span></span><span class="ͼ11">LoginPage</span><span></span><span class="ͼv">extends</span><span></span><span class="ͼ11">BasePage</span><span> {</span><br/><br/><span></span><span class="ͼ11">LoginPage</span><span>(</span><span class="ͼ11">String</span><span></span><span class="ͼ11">driver</span><span>) {</span><br/><br/><span></span><span class="ͼv">super</span><span>(</span><span class="ͼ11">driver</span><span>);</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"LoginPage initialized"</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">LoginPage</span><span>(</span><span class="ͼz">"ChromeDriver"</span><span>);</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 13 — Appium Framework Simulation

<pre class="overflow-visible! px-0!" data-start="5926" data-end="6640"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">BaseTest</span><span> {</span><br/><br/><span></span><span class="ͼ11">String</span><span></span><span class="ͼ11">platform</span><span>;</span><br/><br/><span></span><span class="ͼ11">BaseTest</span><span>(</span><span class="ͼ11">String</span><span></span><span class="ͼ11">platform</span><span>) {</span><br/><br/><span></span><span class="ͼy">this</span><span class="ͼv">.</span><span class="ͼ11">platform</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">platform</span><span>;</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Platform: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">platform</span><span>);</span><br/><span>    }</span><br/><span>}</span><br/><br/><span class="ͼv">class</span><span></span><span class="ͼ11">AndroidTest</span><span></span><span class="ͼv">extends</span><span></span><span class="ͼ11">BaseTest</span><span> {</span><br/><br/><span></span><span class="ͼ11">AndroidTest</span><span>(</span><span class="ͼ11">String</span><span></span><span class="ͼ11">platform</span><span>, </span><span class="ͼ11">String</span><span></span><span class="ͼ11">deviceName</span><span>) {</span><br/><br/><span></span><span class="ͼv">super</span><span>(</span><span class="ͼ11">platform</span><span>);</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Android Device: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">deviceName</span><span>);</span><br/><span>    }</span><br/><span>}</span><br/><br/><span class="ͼv">class</span><span></span><span class="ͼ11">IOS_Test</span><span></span><span class="ͼv">extends</span><span></span><span class="ͼ11">BaseTest</span><span> {</span><br/><br/><span></span><span class="ͼ11">IOS_Test</span><span>(</span><span class="ͼ11">String</span><span></span><span class="ͼ11">platform</span><span>, </span><span class="ͼ11">String</span><span></span><span class="ͼ11">deviceName</span><span>) {</span><br/><br/><span></span><span class="ͼv">super</span><span>(</span><span class="ͼ11">platform</span><span>);</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"IOS Device: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">deviceName</span><span>);</span><br/><span>    }</span><br/><span>}</span><br/><br/><span class="ͼv">class</span><span></span><span class="ͼ11">Main</span><span> {</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">AndroidTest</span><span>(</span><span class="ͼz">"Android"</span><span>, </span><span class="ͼz">"Pixel"</span><span>);</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">IOS_Test</span><span>(</span><span class="ͼz">"IOS"</span><span>, </span><span class="ͼz">"iPhone"</span><span>);</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 14 — API Framework Simulation

<pre class="overflow-visible! px-0!" data-start="6688" data-end="7140"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">BaseAPI</span><span> {</span><br/><br/><span></span><span class="ͼ11">String</span><span></span><span class="ͼ11">baseURL</span><span>;</span><br/><br/><span></span><span class="ͼ11">BaseAPI</span><span>(</span><span class="ͼ11">String</span><span></span><span class="ͼ11">baseURL</span><span>) {</span><br/><br/><span></span><span class="ͼy">this</span><span class="ͼv">.</span><span class="ͼ11">baseURL</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">baseURL</span><span>;</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Base URL: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">baseURL</span><span>);</span><br/><span>    }</span><br/><span>}</span><br/><br/><span class="ͼv">class</span><span></span><span class="ͼ11">UserAPI</span><span></span><span class="ͼv">extends</span><span></span><span class="ͼ11">BaseAPI</span><span> {</span><br/><br/><span></span><span class="ͼ11">UserAPI</span><span>(</span><span class="ͼ11">String</span><span></span><span class="ͼ11">baseURL</span><span>, </span><span class="ͼ11">String</span><span></span><span class="ͼ11">token</span><span>) {</span><br/><br/><span></span><span class="ͼv">super</span><span>(</span><span class="ͼ11">baseURL</span><span>);</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Token: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">token</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">UserAPI</span><span>(</span><span class="ͼz">"https://api.test.com"</span><span>, </span><span class="ͼz">"abc123"</span><span>);</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 15 —** **`this()` on Second Line

<pre class="overflow-visible! px-0!" data-start="7187" data-end="7328"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Test</span><span> {</span><br/><br/><span></span><span class="ͼ11">Test</span><span>() {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Hello"</span><span>);</span><br/><br/><span></span><span class="ͼy">this</span><span>(</span><span class="ͼy">10</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼ11">Test</span><span>(</span><span class="ͼ11">int</span><span></span><span class="ͼ11">a</span><span>) {</span><br/><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Error

<pre class="overflow-visible! px-0!" data-start="7344" data-end="7408"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="relative"><div class="pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span>Constructor call must be first statement</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# WHY?

Java wants constructor chain resolved before any logic executes.

---

# Program 16 —** **`super()` on Second Line

<pre class="overflow-visible! px-0!" data-start="7535" data-end="7707"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Parent</span><span> {</span><br/><br/><span></span><span class="ͼ11">Parent</span><span>() {</span><br/><br/><span>    }</span><br/><span>}</span><br/><br/><span class="ͼv">class</span><span></span><span class="ͼ11">Child</span><span></span><span class="ͼv">extends</span><span></span><span class="ͼ11">Parent</span><span> {</span><br/><br/><span></span><span class="ͼ11">Child</span><span>() {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Hello"</span><span>);</span><br/><br/><span></span><span class="ͼv">super</span><span>();</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Error

<pre class="overflow-visible! px-0!" data-start="7723" data-end="7787"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="relative"><div class="pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span>Constructor call must be first statement</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 17 — Recursive Constructor

<pre class="overflow-visible! px-0!" data-start="7832" data-end="8024"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Test</span><span> {</span><br/><br/><span></span><span class="ͼ11">Test</span><span>() {</span><br/><br/><span></span><span class="ͼy">this</span><span>(</span><span class="ͼy">10</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼ11">Test</span><span>(</span><span class="ͼ11">int</span><span></span><span class="ͼ11">a</span><span>) {</span><br/><br/><span></span><span class="ͼy">this</span><span>();</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">Test</span><span>();</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Result

<pre class="overflow-visible! px-0!" data-start="8041" data-end="8097"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="relative"><div class="pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span>Recursive constructor invocation</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Compiler detects recursion.

---

# Program 18 — Multiple** **`super()`

<pre class="overflow-visible! px-0!" data-start="8168" data-end="8320"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Parent</span><span> {</span><br/><br/><span></span><span class="ͼ11">Parent</span><span>() {</span><br/><br/><span>    }</span><br/><span>}</span><br/><br/><span class="ͼv">class</span><span></span><span class="ͼ11">Child</span><span></span><span class="ͼv">extends</span><span></span><span class="ͼ11">Parent</span><span> {</span><br/><br/><span></span><span class="ͼ11">Child</span><span>() {</span><br/><br/><span></span><span class="ͼv">super</span><span>();</span><br/><br/><span></span><span class="ͼv">super</span><span>();</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Error

<pre class="overflow-visible! px-0!" data-start="8336" data-end="8400"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="relative"><div class="pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span>Constructor call must be first statement</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# WHY?

Only one constructor call allowed at first line.

---

# Program 19 — Singleton Pattern

<pre class="overflow-visible! px-0!" data-start="8504" data-end="8990"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Singleton</span><span> {</span><br/><br/><span></span><span class="ͼv">private</span><span></span><span class="ͼv">static</span><span></span><span class="ͼ11">Singleton</span><span></span><span class="ͼ11">obj</span><span>;</span><br/><br/><span></span><span class="ͼv">private</span><span></span><span class="ͼ11">Singleton</span><span>() {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Object Created"</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">static</span><span></span><span class="ͼ11">Singleton</span><span></span><span class="ͼ11">getInstance</span><span>() {</span><br/><br/><span></span><span class="ͼv">if</span><span> (</span><span class="ͼ11">obj</span><span></span><span class="ͼv">==</span><span></span><span class="ͼy">null</span><span>) {</span><br/><br/><span></span><span class="ͼ11">obj</span><span></span><span class="ͼv">=</span><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">Singleton</span><span>();</span><br/><span>        }</span><br/><br/><span></span><span class="ͼv">return</span><span></span><span class="ͼ11">obj</span><span>;</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼ11">Singleton</span><span></span><span class="ͼ11">s1</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">Singleton</span><span class="ͼv">.</span><span class="ͼ11">getInstance</span><span>();</span><br/><br/><span></span><span class="ͼ11">Singleton</span><span></span><span class="ͼ11">s2</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">Singleton</span><span class="ͼv">.</span><span class="ͼ11">getInstance</span><span>();</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼ11">s1</span><span></span><span class="ͼv">==</span><span></span><span class="ͼ11">s2</span><span>);</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Output

<pre class="overflow-visible! px-0!" data-start="9007" data-end="9050"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="relative"><div class="pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span>Object Created</span><br/><span>true</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 20 — Constructor Counter

<pre class="overflow-visible! px-0!" data-start="9093" data-end="9386"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Employee</span><span> {</span><br/><br/><span></span><span class="ͼv">static</span><span></span><span class="ͼ11">int</span><span></span><span class="ͼ11">count</span><span></span><span class="ͼv">=</span><span></span><span class="ͼy">0</span><span>;</span><br/><br/><span></span><span class="ͼ11">Employee</span><span>() {</span><br/><br/><span></span><span class="ͼ11">count</span><span class="ͼv">++</span><span>;</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Object Count: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">count</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">Employee</span><span>();</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">Employee</span><span>();</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">Employee</span><span>();</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 21 — Constructor Flow Prediction

<pre class="overflow-visible! px-0!" data-start="9437" data-end="9746"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">A</span><span> {</span><br/><br/><span></span><span class="ͼ11">A</span><span>() {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"A"</span><span>);</span><br/><span>    }</span><br/><span>}</span><br/><br/><span class="ͼv">class</span><span></span><span class="ͼ11">B</span><span></span><span class="ͼv">extends</span><span></span><span class="ͼ11">A</span><span> {</span><br/><br/><span></span><span class="ͼ11">B</span><span>() {</span><br/><br/><span></span><span class="ͼy">this</span><span>(</span><span class="ͼy">10</span><span>);</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"B"</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼ11">B</span><span>(</span><span class="ͼ11">int</span><span></span><span class="ͼ11">a</span><span>) {</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"B int"</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">B</span><span>();</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Output

<pre class="overflow-visible! px-0!" data-start="9763" data-end="9796"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="relative"><div class="pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span>A</span><br/><span>B int</span><br/><span>B</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# WHY?

Flow:

<pre class="overflow-visible! px-0!" data-start="9818" data-end="9899"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="relative"><div class="pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span>B()</span><br/><span>   -> this(10)</span><br/><span>        -> super()</span><br/><span>             -> A()</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Program 22 — Ecommerce System

<pre class="overflow-visible! px-0!" data-start="9939" data-end="11044"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">class</span><span></span><span class="ͼ11">Product</span><span> {</span><br/><br/><span></span><span class="ͼ11">int</span><span></span><span class="ͼ11">productId</span><span>;</span><br/><br/><span></span><span class="ͼ11">Product</span><span>(</span><span class="ͼ11">int</span><span></span><span class="ͼ11">productId</span><span>) {</span><br/><br/><span></span><span class="ͼy">this</span><span class="ͼv">.</span><span class="ͼ11">productId</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">productId</span><span>;</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Product ID: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">productId</span><span>);</span><br/><span>    }</span><br/><span>}</span><br/><br/><span class="ͼv">class</span><span></span><span class="ͼ11">Electronics</span><span></span><span class="ͼv">extends</span><span></span><span class="ͼ11">Product</span><span> {</span><br/><br/><span></span><span class="ͼ11">String</span><span></span><span class="ͼ11">brand</span><span>;</span><br/><br/><span></span><span class="ͼ11">Electronics</span><span>(</span><span class="ͼ11">int</span><span></span><span class="ͼ11">productId</span><span>, </span><span class="ͼ11">String</span><span></span><span class="ͼ11">brand</span><span>) {</span><br/><br/><span></span><span class="ͼv">super</span><span>(</span><span class="ͼ11">productId</span><span>);</span><br/><br/><span></span><span class="ͼy">this</span><span class="ͼv">.</span><span class="ͼ11">brand</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">brand</span><span>;</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Brand: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">brand</span><span>);</span><br/><span>    }</span><br/><span>}</span><br/><br/><span class="ͼv">class</span><span></span><span class="ͼ11">MobilePhone</span><span></span><span class="ͼv">extends</span><span></span><span class="ͼ11">Electronics</span><span> {</span><br/><br/><span></span><span class="ͼ11">int</span><span></span><span class="ͼ11">price</span><span>;</span><br/><span></span><span class="ͼ11">int</span><span></span><span class="ͼ11">ram</span><span>;</span><br/><span></span><span class="ͼ11">int</span><span></span><span class="ͼ11">storage</span><span>;</span><br/><br/><span></span><span class="ͼ11">MobilePhone</span><span>(</span><br/><span></span><span class="ͼ11">int</span><span></span><span class="ͼ11">productId</span><span>,</span><br/><span></span><span class="ͼ11">String</span><span></span><span class="ͼ11">brand</span><span>,</span><br/><span></span><span class="ͼ11">int</span><span></span><span class="ͼ11">price</span><span>,</span><br/><span></span><span class="ͼ11">int</span><span></span><span class="ͼ11">ram</span><span>,</span><br/><span></span><span class="ͼ11">int</span><span></span><span class="ͼ11">storage</span><span>) {</span><br/><br/><span></span><span class="ͼv">super</span><span>(</span><span class="ͼ11">productId</span><span>, </span><span class="ͼ11">brand</span><span>);</span><br/><br/><span></span><span class="ͼy">this</span><span class="ͼv">.</span><span class="ͼ11">price</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">price</span><span>;</span><br/><span></span><span class="ͼy">this</span><span class="ͼv">.</span><span class="ͼ11">ram</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">ram</span><span>;</span><br/><span></span><span class="ͼy">this</span><span class="ͼv">.</span><span class="ͼ11">storage</span><span></span><span class="ͼv">=</span><span></span><span class="ͼ11">storage</span><span>;</span><br/><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Price: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">price</span><span>);</span><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"RAM: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">ram</span><span>);</span><br/><span></span><span class="ͼ11">System</span><span class="ͼv">.</span><span class="ͼ11">out</span><span class="ͼv">.</span><span class="ͼ11">println</span><span>(</span><span class="ͼz">"Storage: "</span><span></span><span class="ͼv">+</span><span></span><span class="ͼ11">storage</span><span>);</span><br/><span>    }</span><br/><br/><span></span><span class="ͼv">public</span><span></span><span class="ͼv">static</span><span></span><span class="ͼv">void</span><span></span><span class="ͼ11">main</span><span>(</span><span class="ͼ11">String</span><span>[] </span><span class="ͼ11">args</span><span>) {</span><br/><br/><span></span><span class="ͼv">new</span><span></span><span class="ͼ11">MobilePhone</span><span>(</span><br/><span></span><span class="ͼy">101</span><span>,</span><br/><span></span><span class="ͼz">"Samsung"</span><span>,</span><br/><span></span><span class="ͼy">80000</span><span>,</span><br/><span></span><span class="ͼy">12</span><span>,</span><br/><span></span><span class="ͼy">256</span><br/><span>        );</span><br/><span>    }</span><br/><span>}</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Interview Answers

---

# Q1 — Why** **`this()` must be first line?

Because constructor chaining must complete before object initialization logic.

---

# Q2 — Why** **`super()` must be first line?

Parent initialization must happen before child initialization.

---

# Q3 — Can constructor be inherited?

❌ NO

---

# Q4 — Can constructor be overridden?

❌ NO

---

# Q5 — Difference

| Keyword     | Purpose                   |
| ----------- | ------------------------- |
| `this`    | current object            |
| `this()`  | current class constructor |
| `super`   | parent object             |
| `super()` | parent constructor        |

---

# Q6 — What if parent has only parameterized constructor?

Child MUST explicitly call:

<pre class="overflow-visible! px-0!" data-start="11690" data-end="11727"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">super</span><span>(</span><span class="ͼ11">value</span><span>);</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Otherwise compile error.

---

# Q7 — What if child constructor does not call** **`super()`?

Java automatically inserts:

<pre class="overflow-visible! px-0!" data-start="11848" data-end="11880"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class="relative"><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼs ͼ16"><div class="cm-scroller"><pre class="cm-content q9tKkq_readonly m-0"><code><span class="ͼv">super</span><span>();</span></code></pre></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# Q8 — Why frameworks use constructor chaining?

Because frameworks need:

* shared driver
* shared config
* reusable initialization
* centralized setup

---

# Q9 — Difference between object creation and constructor execution?

| Object Creation   | Constructor Execution |
| ----------------- | --------------------- |
| memory allocation | initialization        |
| `new` keyword   | constructor body      |
