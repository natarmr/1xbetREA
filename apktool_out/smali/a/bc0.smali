.class public final La/bc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bc0;->a:B

    iput-object p1, p0, La/bc0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final c(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final d(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final e(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final f(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/bc0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/bc0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    return-void

    .line 9
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast v1, La/kxc0;

    .line 13
    .line 14
    sget-object p0, La/kxc0;->Y1:La/jh70;

    .line 15
    .line 16
    invoke-virtual {v1}, La/kxc0;->K0()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast v1, La/qwc0;

    .line 24
    .line 25
    sget-object p0, La/qwc0;->Z1:La/rl70;

    .line 26
    .line 27
    invoke-virtual {v1}, La/qwc0;->K0()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    check-cast v1, La/l590;

    .line 35
    .line 36
    iget-object p0, v1, La/l590;->N1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 37
    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    invoke-virtual {v1, p0}, La/l590;->J0(La/siq;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, La/l590;->H0()V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void

    .line 53
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    :pswitch_5
    return-void

    .line 57
    :pswitch_6
    check-cast v1, Landroid/view/View;

    .line 58
    .line 59
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 63
    .line 64
    invoke-virtual {v1}, Landroid/view/View;->requestApplyInsets()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_7
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v1, La/uhq;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_8
    check-cast v1, La/cxn;

    .line 82
    .line 83
    iget-object p0, v1, La/cxn;->t:Landroid/view/accessibility/AccessibilityManager;

    .line 84
    .line 85
    iget-object p1, v1, La/cxn;->u:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    .line 86
    .line 87
    if-eqz p1, :cond_1

    .line 88
    .line 89
    if-eqz p0, :cond_1

    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_1

    .line 96
    .line 97
    iget-object p1, v1, La/cxn;->u:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    .line 98
    .line 99
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 100
    .line 101
    .line 102
    :cond_1
    return-void

    .line 103
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    check-cast v1, La/bib;

    .line 107
    .line 108
    sget-object p0, La/bib;->X1:La/bj5;

    .line 109
    .line 110
    invoke-virtual {v1}, La/bib;->K0()V

    .line 111
    .line 112
    .line 113
    :pswitch_a
    return-void

    .line 114
    :pswitch_b
    check-cast v1, La/rz2;

    .line 115
    .line 116
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    iget-boolean p1, v1, La/rz2;->d:Z

    .line 121
    .line 122
    if-nez p1, :cond_2

    .line 123
    .line 124
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    iget-object p1, v1, La/rz2;->f:La/qz2;

    .line 129
    .line 130
    invoke-virtual {p0, p1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 131
    .line 132
    .line 133
    const/4 p0, 0x1

    .line 134
    iput-boolean p0, v1, La/rz2;->d:Z

    .line 135
    .line 136
    :cond_2
    return-void

    .line 137
    :pswitch_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    check-cast v1, Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;

    .line 141
    .line 142
    iget-boolean p0, v1, Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;->r:Z

    .line 143
    .line 144
    if-eqz p0, :cond_3

    .line 145
    .line 146
    invoke-static {v1}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 147
    .line 148
    .line 149
    :cond_3
    return-void

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/bc0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/bc0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/c4m0;

    .line 14
    .line 15
    invoke-virtual {p0, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iget-object v0, p0, La/bc0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, La/h4m0;

    .line 22
    .line 23
    iget-object v1, v0, La/h4m0;->p:Landroid/view/ViewTreeObserver;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v1, v0, La/h4m0;->p:Landroid/view/ViewTreeObserver;

    .line 38
    .line 39
    :cond_0
    iget-object v1, v0, La/h4m0;->p:Landroid/view/ViewTreeObserver;

    .line 40
    .line 41
    iget-object v0, v0, La/h4m0;->j:La/de3;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, La/bc0;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, La/l590;

    .line 64
    .line 65
    iput-boolean v1, p0, La/l590;->O1:Z

    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, La/bc0;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, La/vv5;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :pswitch_5
    iget-object p0, p0, La/bc0;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;

    .line 85
    .line 86
    iget-object p1, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->c:La/xwv;

    .line 87
    .line 88
    if-eqz p1, :cond_2

    .line 89
    .line 90
    iget-object v0, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->b:Landroid/view/accessibility/AccessibilityManager;

    .line 91
    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 95
    .line 96
    .line 97
    iput-object v2, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->c:La/xwv;

    .line 98
    .line 99
    :cond_2
    return-void

    .line 100
    :pswitch_6
    iget-object p0, p0, La/bc0;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;

    .line 103
    .line 104
    iget-object p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->h:La/xwv;

    .line 105
    .line 106
    if-eqz p1, :cond_3

    .line 107
    .line 108
    iget-object v0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->g:Landroid/view/accessibility/AccessibilityManager;

    .line 109
    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 113
    .line 114
    .line 115
    iput-object v2, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->h:La/xwv;

    .line 116
    .line 117
    :cond_3
    :pswitch_7
    return-void

    .line 118
    :pswitch_8
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_9
    iget-object p0, p0, La/bc0;->b:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p0, La/cxn;

    .line 125
    .line 126
    iget-object p1, p0, La/cxn;->u:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    .line 127
    .line 128
    if-eqz p1, :cond_4

    .line 129
    .line 130
    iget-object p0, p0, La/cxn;->t:Landroid/view/accessibility/AccessibilityManager;

    .line 131
    .line 132
    if-eqz p0, :cond_4

    .line 133
    .line 134
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 135
    .line 136
    .line 137
    :cond_4
    return-void

    .line 138
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :pswitch_b
    iget-object v0, p0, La/bc0;->b:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v0, La/wva;

    .line 145
    .line 146
    iget-object v1, v0, La/wva;->y:Landroid/view/ViewTreeObserver;

    .line 147
    .line 148
    if-eqz v1, :cond_6

    .line 149
    .line 150
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-nez v1, :cond_5

    .line 155
    .line 156
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    iput-object v1, v0, La/wva;->y:Landroid/view/ViewTreeObserver;

    .line 161
    .line 162
    :cond_5
    iget-object v1, v0, La/wva;->y:Landroid/view/ViewTreeObserver;

    .line 163
    .line 164
    iget-object v0, v0, La/wva;->j:La/de3;

    .line 165
    .line 166
    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 167
    .line 168
    .line 169
    :cond_6
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :pswitch_c
    iget-object p0, p0, La/bc0;->b:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast p0, La/rz2;

    .line 176
    .line 177
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    iget-boolean v0, p0, La/rz2;->d:Z

    .line 182
    .line 183
    if-eqz v0, :cond_7

    .line 184
    .line 185
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    iget-object v0, p0, La/rz2;->f:La/qz2;

    .line 190
    .line 191
    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 192
    .line 193
    .line 194
    iput-boolean v1, p0, La/rz2;->d:Z

    .line 195
    .line 196
    :cond_7
    iget-object p1, p0, La/rz2;->e:La/ehf0;

    .line 197
    .line 198
    if-eqz p1, :cond_9

    .line 199
    .line 200
    monitor-enter p1

    .line 201
    :try_start_0
    iget-object v0, p1, La/ehf0;->b:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, La/hz40;

    .line 204
    .line 205
    if-eqz v0, :cond_8

    .line 206
    .line 207
    invoke-virtual {v0}, La/hz40;->a()V

    .line 208
    .line 209
    .line 210
    goto :goto_0

    .line 211
    :catchall_0
    move-exception p0

    .line 212
    goto :goto_1

    .line 213
    :cond_8
    :goto_0
    iput-object v2, p1, La/ehf0;->c:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 214
    .line 215
    monitor-exit p1

    .line 216
    goto :goto_2

    .line 217
    :goto_1
    monitor-exit p1

    .line 218
    throw p0

    .line 219
    :cond_9
    :goto_2
    iput-object v2, p0, La/rz2;->e:La/ehf0;

    .line 220
    .line 221
    return-void

    .line 222
    :pswitch_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    iget-object p0, p0, La/bc0;->b:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast p0, Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;

    .line 228
    .line 229
    iget-boolean p1, p0, Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;->r:Z

    .line 230
    .line 231
    if-eqz p1, :cond_a

    .line 232
    .line 233
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 234
    .line 235
    .line 236
    :cond_a
    return-void

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
