.class public final La/xkh0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/xkh0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/gne0",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final n2:La/gne0;

.field public static final synthetic o2:[La/iiy;

.field public static final p2:Ljava/lang/String;


# instance fields
.field public final k2:La/a8z;

.field public final l2:La/a8z;

.field public final m2:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/xkh0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/security/impl/presentation/secret_question_choice/params/SecretQuestionChoiceScreenParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    new-array v2, v2, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v2, v4

    .line 17
    .line 18
    sput-object v2, La/xkh0;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/gne0;

    .line 21
    .line 22
    const/16 v2, 0xe

    .line 23
    .line 24
    invoke-direct {v0, v2}, La/gne0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/xkh0;->n2:La/gne0;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, La/xkh0;->p2:Ljava/lang/String;

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, La/hlh0;

    .line 5
    .line 6
    sget-object v1, La/sre0;->a:La/tre0;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/wkh0;

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-direct {v1, p0, v2}, La/wkh0;-><init>(La/xkh0;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/xkh0;->k2:La/a8z;

    .line 23
    .line 24
    new-instance v0, La/wkh0;

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    invoke-direct {v0, p0, v1}, La/wkh0;-><init>(La/xkh0;B)V

    .line 28
    .line 29
    .line 30
    sget-object v1, La/wez;->b:La/wez;

    .line 31
    .line 32
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/xkh0;->l2:La/a8z;

    .line 37
    .line 38
    new-instance v0, La/khf0;

    .line 39
    .line 40
    const-string v1, "SECRET_QUESTION_CHOICE_SCREEN_PARAMS"

    .line 41
    .line 42
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, La/xkh0;->m2:La/khf0;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 14

    .line 1
    const v0, 0x70b0e078

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/xkh0;->P0()La/k3t0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, La/i3t0;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, La/xkh0;->P0()La/k3t0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    sget-object v7, La/ukd;->a:La/cl5;

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    if-ne v3, v7, :cond_1

    .line 34
    .line 35
    :cond_0
    new-instance v3, La/gwg0;

    .line 36
    .line 37
    const/16 v1, 0xc

    .line 38
    .line 39
    invoke-direct {v3, p0, v1}, La/gwg0;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    sget-object v1, La/or00;->a:La/zfn;

    .line 48
    .line 49
    invoke-virtual {p1, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, La/clz;

    .line 54
    .line 55
    sget-object v4, La/lkz;->a:La/lkz;

    .line 56
    .line 57
    invoke-static {v3, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {p1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    invoke-virtual {p1, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    or-int/2addr v3, v5

    .line 70
    const/4 v5, 0x3

    .line 71
    invoke-virtual {p1, v5}, La/fet;->e(I)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    or-int/2addr v3, v5

    .line 76
    invoke-virtual {p1, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    or-int/2addr v3, v5

    .line 81
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    if-nez v3, :cond_2

    .line 86
    .line 87
    if-ne v5, v7, :cond_3

    .line 88
    .line 89
    :cond_2
    move-object v3, v1

    .line 90
    goto :goto_0

    .line 91
    :cond_3
    move-object v3, v1

    .line 92
    goto :goto_1

    .line 93
    :goto_0
    new-instance v1, La/kc70;

    .line 94
    .line 95
    const/4 v5, 0x0

    .line 96
    const/16 v6, 0x10

    .line 97
    .line 98
    invoke-direct/range {v1 .. v6}, La/kc70;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    move-object v5, v1

    .line 105
    :goto_1
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 106
    .line 107
    invoke-static {p1, v3, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    const/4 v3, 0x0

    .line 119
    if-nez v1, :cond_4

    .line 120
    .line 121
    if-ne v2, v7, :cond_5

    .line 122
    .line 123
    :cond_4
    new-instance v2, La/wkh0;

    .line 124
    .line 125
    invoke-direct {v2, p0, v3}, La/wkh0;-><init>(La/xkh0;B)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_5
    move-object v8, v2

    .line 132
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 133
    .line 134
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    const/4 v4, 0x1

    .line 143
    if-nez v1, :cond_6

    .line 144
    .line 145
    if-ne v2, v7, :cond_7

    .line 146
    .line 147
    :cond_6
    new-instance v2, La/wkh0;

    .line 148
    .line 149
    invoke-direct {v2, p0, v4}, La/wkh0;-><init>(La/xkh0;B)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :cond_7
    move-object v9, v2

    .line 156
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 157
    .line 158
    const/4 v12, 0x0

    .line 159
    const/4 v13, 0x4

    .line 160
    const/4 v10, 0x0

    .line 161
    move-object v11, p1

    .line 162
    invoke-static/range {v8 .. v13}, La/v3c;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 163
    .line 164
    .line 165
    new-instance v5, La/bw5;

    .line 166
    .line 167
    invoke-static {v4, v11}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    new-instance p1, La/tft;

    .line 172
    .line 173
    const/16 v1, 0x10

    .line 174
    .line 175
    invoke-direct {p1, v0, v1}, La/tft;-><init>(La/l7m0;B)V

    .line 176
    .line 177
    .line 178
    const v1, 0x15a86569

    .line 179
    .line 180
    .line 181
    invoke-static {v1, p1, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    new-instance p1, La/in80;

    .line 186
    .line 187
    const/16 v1, 0x14

    .line 188
    .line 189
    invoke-direct {p1, v0, p0, v1}, La/in80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 190
    .line 191
    .line 192
    const p0, 0x4ac51da7    # 6459091.5f

    .line 193
    .line 194
    .line 195
    invoke-static {p0, p1, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    const/16 v10, 0xa

    .line 200
    .line 201
    const/4 v8, 0x0

    .line 202
    invoke-direct/range {v5 .. v10}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v11, v3}, La/fet;->r(Z)V

    .line 206
    .line 207
    .line 208
    return-object v5
.end method

.method public final P0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xkh0;->k2:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method
