.class public final synthetic La/h5b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/Window;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Z

.field public final synthetic e:La/l7m0;


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;Landroid/content/Context;ZLa/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/h5b;->a:B

    iput-object p1, p0, La/h5b;->b:Landroid/view/Window;

    iput-object p2, p0, La/h5b;->c:Landroid/content/Context;

    iput-boolean p3, p0, La/h5b;->d:Z

    iput-object p4, p0, La/h5b;->e:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/h5b;->a:B

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    const v2, 0x1010451

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const v4, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    iget-object v6, p0, La/h5b;->e:La/l7m0;

    .line 14
    .line 15
    iget-boolean v7, p0, La/h5b;->d:Z

    .line 16
    .line 17
    check-cast p1, La/ilz;

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iget-object v8, p0, La/h5b;->b:Landroid/view/Window;

    .line 36
    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    if-eqz v8, :cond_1

    .line 40
    .line 41
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 42
    .line 43
    iget-object v9, p0, La/h5b;->c:Landroid/content/Context;

    .line 44
    .line 45
    invoke-static {v9, v4, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    const/4 v12, 0x0

    .line 50
    xor-int/lit8 v13, v7, 0x1

    .line 51
    .line 52
    const v10, 0x7f0606d8

    .line 53
    .line 54
    .line 55
    invoke-static/range {v8 .. v13}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    if-eqz v8, :cond_1

    .line 60
    .line 61
    invoke-static {v8, v3, v4, v2, v1}, La/ofm0;->z(Landroid/view/Window;Landroid/content/Context;III)V

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_0
    new-instance p0, La/pa2;

    .line 65
    .line 66
    const/16 p1, 0x10

    .line 67
    .line 68
    invoke-direct {p0, p1}, La/pa2;-><init>(B)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-object v8, p0, La/h5b;->b:Landroid/view/Window;

    .line 76
    .line 77
    if-eqz v8, :cond_2

    .line 78
    .line 79
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 80
    .line 81
    const p1, 0x7f040ae1

    .line 82
    .line 83
    .line 84
    iget-object v9, p0, La/h5b;->c:Landroid/content/Context;

    .line 85
    .line 86
    invoke-static {v9, p1, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 87
    .line 88
    .line 89
    move-result v11

    .line 90
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    xor-int/lit8 v13, v7, 0x1

    .line 101
    .line 102
    const v10, 0x7f0606d8

    .line 103
    .line 104
    .line 105
    invoke-static/range {v8 .. v13}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 106
    .line 107
    .line 108
    :cond_2
    new-instance p0, La/pa2;

    .line 109
    .line 110
    const/16 p1, 0xf

    .line 111
    .line 112
    invoke-direct {p0, p1}, La/pa2;-><init>(B)V

    .line 113
    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Ljava/lang/Boolean;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    iget-object v8, p0, La/h5b;->b:Landroid/view/Window;

    .line 130
    .line 131
    if-eqz p1, :cond_3

    .line 132
    .line 133
    if-eqz v8, :cond_4

    .line 134
    .line 135
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 136
    .line 137
    iget-object v9, p0, La/h5b;->c:Landroid/content/Context;

    .line 138
    .line 139
    invoke-static {v9, v4, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    const/4 v12, 0x0

    .line 144
    xor-int/lit8 v13, v7, 0x1

    .line 145
    .line 146
    const v10, 0x7f0606d8

    .line 147
    .line 148
    .line 149
    invoke-static/range {v8 .. v13}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_3
    if-eqz v8, :cond_4

    .line 154
    .line 155
    invoke-static {v8, v3, v4, v2, v1}, La/ofm0;->z(Landroid/view/Window;Landroid/content/Context;III)V

    .line 156
    .line 157
    .line 158
    :cond_4
    :goto_1
    new-instance p0, La/pa2;

    .line 159
    .line 160
    const/4 p1, 0x7

    .line 161
    invoke-direct {p0, p1}, La/pa2;-><init>(B)V

    .line 162
    .line 163
    .line 164
    return-object p0

    .line 165
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    iget-object v8, p0, La/h5b;->b:Landroid/view/Window;

    .line 169
    .line 170
    if-eqz v8, :cond_5

    .line 171
    .line 172
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 173
    .line 174
    iget-object v9, p0, La/h5b;->c:Landroid/content/Context;

    .line 175
    .line 176
    invoke-static {v9, v4, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 177
    .line 178
    .line 179
    move-result v11

    .line 180
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    check-cast p0, Ljava/lang/Boolean;

    .line 185
    .line 186
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 187
    .line 188
    .line 189
    move-result v12

    .line 190
    xor-int/lit8 v13, v7, 0x1

    .line 191
    .line 192
    const v10, 0x7f0606d8

    .line 193
    .line 194
    .line 195
    invoke-static/range {v8 .. v13}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 196
    .line 197
    .line 198
    :cond_5
    new-instance p0, La/pa2;

    .line 199
    .line 200
    const/4 p1, 0x5

    .line 201
    invoke-direct {p0, p1}, La/pa2;-><init>(B)V

    .line 202
    .line 203
    .line 204
    return-object p0

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
