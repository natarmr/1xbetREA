.class public final synthetic La/hp2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/pmi0;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    const/4 p2, 0x4

    iput-byte p2, p0, La/hp2;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hp2;->c:Ljava/lang/Object;

    iput-boolean p3, p0, La/hp2;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/hp2;->a:B

    iput-object p1, p0, La/hp2;->c:Ljava/lang/Object;

    iput-boolean p2, p0, La/hp2;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-byte v0, p0, La/hp2;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-boolean v3, p0, La/hp2;->b:Z

    .line 6
    .line 7
    iget-object p0, p0, La/hp2;->c:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/x3w0;

    .line 13
    .line 14
    iget-object p0, p0, La/x3w0;->b:La/ca6;

    .line 15
    .line 16
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0, v0}, La/ca6;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    check-cast p0, Landroid/view/View;

    .line 25
    .line 26
    if-eqz v3, :cond_3

    .line 27
    .line 28
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 29
    .line 30
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v3, 0x1e

    .line 33
    .line 34
    if-lt v0, v3, :cond_0

    .line 35
    .line 36
    invoke-static {p0}, La/ogu0;->c(Landroid/view/View;)La/cjv0;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :goto_0
    instance-of v3, v0, Landroid/content/ContextWrapper;

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    instance-of v3, v0, Landroid/app/Activity;

    .line 50
    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    check-cast v0, Landroid/app/Activity;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    new-instance v2, La/cjv0;

    .line 62
    .line 63
    invoke-direct {v2, v0, p0}, La/cjv0;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    check-cast v0, Landroid/content/ContextWrapper;

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    goto :goto_0

    .line 74
    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    .line 75
    .line 76
    const/16 p0, 0x8

    .line 77
    .line 78
    invoke-virtual {v2, p0}, La/cjv0;->d(I)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-class v2, Landroid/view/inputmethod/InputMethodManager;

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 93
    .line 94
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 95
    .line 96
    .line 97
    :goto_2
    return-void

    .line 98
    :pswitch_1
    check-cast p0, La/pmi0;

    .line 99
    .line 100
    iget-object p0, p0, La/pmi0;->a:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p0, La/jrs0;

    .line 103
    .line 104
    iget-object p0, p0, La/jrs0;->f:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p0, La/hru;

    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object p0, p0, La/hru;->a:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p0, La/xaw;

    .line 114
    .line 115
    iget-boolean v0, p0, La/xaw;->k:Z

    .line 116
    .line 117
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 118
    .line 119
    .line 120
    if-eqz v3, :cond_4

    .line 121
    .line 122
    iget-object v0, p0, La/xaw;->m:La/b4x;

    .line 123
    .line 124
    if-nez v0, :cond_4

    .line 125
    .line 126
    invoke-virtual {p0}, La/xaw;->f()V

    .line 127
    .line 128
    .line 129
    :cond_4
    return-void

    .line 130
    :pswitch_2
    check-cast p0, La/md3;

    .line 131
    .line 132
    iget-object p0, p0, La/md3;->b:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p0, La/cwj;

    .line 135
    .line 136
    iput-boolean v3, p0, La/cwj;->b:Z

    .line 137
    .line 138
    iget-boolean v0, p0, La/cwj;->a:Z

    .line 139
    .line 140
    if-eqz v0, :cond_5

    .line 141
    .line 142
    iget-object v0, p0, La/cwj;->e:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v0, Landroid/os/Handler;

    .line 145
    .line 146
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    iget-boolean v1, p0, La/cwj;->b:Z

    .line 150
    .line 151
    if-eqz v1, :cond_5

    .line 152
    .line 153
    iget-object p0, p0, La/cwj;->f:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p0, La/z7a;

    .line 156
    .line 157
    const-wide/32 v1, 0x493e0

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 161
    .line 162
    .line 163
    :cond_5
    return-void

    .line 164
    :pswitch_3
    check-cast p0, La/q0a;

    .line 165
    .line 166
    iget-object p0, p0, La/q0a;->c:La/a1a;

    .line 167
    .line 168
    invoke-virtual {p0, v3}, La/a1a;->d(Z)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :pswitch_4
    check-cast p0, La/xex;

    .line 173
    .line 174
    iget-object p0, p0, La/xex;->b:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p0, La/qlo;

    .line 177
    .line 178
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 179
    .line 180
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 181
    .line 182
    iget-boolean v0, p0, La/ulo;->c0:Z

    .line 183
    .line 184
    if-ne v0, v3, :cond_6

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_6
    iput-boolean v3, p0, La/ulo;->c0:Z

    .line 188
    .line 189
    iget-object p0, p0, La/ulo;->m:La/vg00;

    .line 190
    .line 191
    new-instance v0, La/mlo;

    .line 192
    .line 193
    invoke-direct {v0, v1, v3}, La/mlo;-><init>(BZ)V

    .line 194
    .line 195
    .line 196
    const/16 v1, 0x17

    .line 197
    .line 198
    invoke-virtual {p0, v1, v0}, La/vg00;->e(ILa/sg00;)V

    .line 199
    .line 200
    .line 201
    :goto_3
    return-void

    .line 202
    :pswitch_5
    check-cast p0, La/ip2;

    .line 203
    .line 204
    iget-object p0, p0, La/ip2;->a:La/a1a;

    .line 205
    .line 206
    invoke-virtual {p0, v3}, La/a1a;->d(Z)V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
