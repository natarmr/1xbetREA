.class public final La/j14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/w0r;Landroidx/fragment/app/f;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/j14;->a:B

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/j14;->c:Ljava/lang/Object;

    iput-object p2, p0, La/j14;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/ytj0;Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput-byte v0, p0, La/j14;->a:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/j14;->b:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/j14;->c:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 21
    iput-byte p3, p0, La/j14;->a:B

    iput-object p1, p0, La/j14;->b:Ljava/lang/Object;

    iput-object p2, p0, La/j14;->c:Ljava/lang/Object;

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


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-byte v0, p0, La/j14;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/j14;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p0, La/j14;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    check-cast v3, La/x1;

    .line 13
    .line 14
    invoke-static {v3}, La/s7n0;->l(Landroid/view/View;)La/clz;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    check-cast v2, La/mie0;

    .line 21
    .line 22
    invoke-interface {p1}, La/clz;->x()La/glz;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {v3, p1}, La/lvm0;->l(La/x1;La/glz;)La/ugu0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, v2, La/mie0;->a:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {v3, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string p1, "View tree for "

    .line 39
    .line 40
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p1, " has no ViewTreeLifecycleOwner"

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, La/xcx;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 56
    .line 57
    .line 58
    invoke-static {}, La/csj;->b()V

    .line 59
    .line 60
    .line 61
    :goto_0
    return-void

    .line 62
    :pswitch_1
    check-cast v3, Landroid/view/ViewGroup;

    .line 63
    .line 64
    check-cast v2, La/a9o0;

    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    invoke-virtual {v3, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 78
    .line 79
    .line 80
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, Landroid/app/Activity;

    .line 87
    .line 88
    if-eqz p0, :cond_1

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-eqz p1, :cond_1

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-eqz p1, :cond_1

    .line 101
    .line 102
    iget-object v1, p1, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    .line 103
    .line 104
    :cond_1
    if-nez p0, :cond_2

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    if-nez v1, :cond_3

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    check-cast v3, La/ytj0;

    .line 111
    .line 112
    invoke-virtual {v3, v1, p0}, La/ytj0;->c(Landroid/os/IBinder;Landroid/app/Activity;)V

    .line 113
    .line 114
    .line 115
    :goto_1
    return-void

    .line 116
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    check-cast v3, La/yge0;

    .line 120
    .line 121
    check-cast v2, La/l5g;

    .line 122
    .line 123
    invoke-virtual {v3, v2}, La/yge0;->v(La/ahe0;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_4
    check-cast v3, Landroidx/fragment/app/f;

    .line 128
    .line 129
    iget-object p0, v3, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 130
    .line 131
    invoke-virtual {v3}, Landroidx/fragment/app/f;->k()V

    .line 132
    .line 133
    .line 134
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    check-cast p0, Landroid/view/ViewGroup;

    .line 141
    .line 142
    check-cast v2, La/w0r;

    .line 143
    .line 144
    iget-object p1, v2, La/w0r;->a:Landroidx/fragment/app/e;

    .line 145
    .line 146
    invoke-static {p0, p1}, La/nxj;->i(Landroid/view/ViewGroup;Landroidx/fragment/app/e;)La/nxj;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-virtual {p0}, La/nxj;->h()V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    check-cast v3, Landroid/view/View;

    .line 158
    .line 159
    invoke-virtual {v3, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 160
    .line 161
    .line 162
    check-cast v2, La/by5;

    .line 163
    .line 164
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    instance-of p1, p0, La/jkf0;

    .line 169
    .line 170
    if-eqz p1, :cond_4

    .line 171
    .line 172
    move-object v1, p0

    .line 173
    check-cast v1, La/jkf0;

    .line 174
    .line 175
    :cond_4
    if-eqz v1, :cond_5

    .line 176
    .line 177
    check-cast v1, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 178
    .line 179
    iget-object p0, v1, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->A1:La/ndk0;

    .line 180
    .line 181
    if-eqz p0, :cond_5

    .line 182
    .line 183
    invoke-virtual {v1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->A()V

    .line 184
    .line 185
    .line 186
    :cond_5
    return-void

    .line 187
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    check-cast v3, Landroid/view/View;

    .line 191
    .line 192
    invoke-virtual {v3, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 193
    .line 194
    .line 195
    check-cast v2, La/k14;

    .line 196
    .line 197
    iget-object p0, v2, La/k14;->a:Landroid/view/View;

    .line 198
    .line 199
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    if-eqz p0, :cond_6

    .line 204
    .line 205
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    goto :goto_2

    .line 210
    :cond_6
    move-object p0, v1

    .line 211
    :goto_2
    instance-of p1, p0, Landroid/view/View;

    .line 212
    .line 213
    if-eqz p1, :cond_7

    .line 214
    .line 215
    move-object v1, p0

    .line 216
    check-cast v1, Landroid/view/View;

    .line 217
    .line 218
    :cond_7
    iget-object p0, v2, La/k14;->h:Ljava/lang/ref/WeakReference;

    .line 219
    .line 220
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    check-cast p0, Landroid/view/View;

    .line 225
    .line 226
    invoke-virtual {v2, v1, p0}, La/k14;->f(Landroid/view/View;Landroid/view/View;)V

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    nop

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
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
    iget-byte v0, p0, La/j14;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/j14;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/j14;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {v2, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 13
    .line 14
    .line 15
    check-cast v1, La/fge0;

    .line 16
    .line 17
    invoke-virtual {v1}, La/fge0;->A()V

    .line 18
    .line 19
    .line 20
    :pswitch_0
    return-void

    .line 21
    :pswitch_1
    check-cast v2, Landroid/view/ViewGroup;

    .line 22
    .line 23
    check-cast v1, La/a9o0;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-virtual {v2, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    check-cast v2, La/yge0;

    .line 41
    .line 42
    check-cast v1, La/l5g;

    .line 43
    .line 44
    invoke-virtual {v2, v1}, La/yge0;->y(La/ahe0;)V

    .line 45
    .line 46
    .line 47
    :pswitch_4
    return-void

    .line 48
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
