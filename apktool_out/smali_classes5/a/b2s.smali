.class public final synthetic La/b2s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ber;


# instance fields
.field public final synthetic a:La/l7m0;

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:La/l7m0;

.field public final synthetic e:La/j2s;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/l7m0;La/l7m0;La/l7m0;La/j2s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b2s;->a:La/l7m0;

    iput-object p2, p0, La/b2s;->b:La/l7m0;

    iput-object p3, p0, La/b2s;->c:La/l7m0;

    iput-object p4, p0, La/b2s;->d:La/l7m0;

    iput-object p5, p0, La/b2s;->e:La/j2s;

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/fet;Ljava/lang/Integer;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    move-object v2, p1

    .line 4
    check-cast v2, La/mm40;

    .line 5
    .line 6
    move-object v5, p2

    .line 7
    check-cast v5, La/xcz;

    .line 8
    .line 9
    move-object v6, p3

    .line 10
    check-cast v6, La/xcz;

    .line 11
    .line 12
    move-object v9, p4

    .line 13
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 14
    .line 15
    move-object/from16 v8, p5

    .line 16
    .line 17
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    sget-object p2, La/j2s;->b2:La/xak;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    and-int/lit8 p2, p1, 0x6

    .line 41
    .line 42
    if-nez p2, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_0

    .line 49
    .line 50
    const/4 p2, 0x4

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 p2, 0x2

    .line 53
    :goto_0
    or-int/2addr p2, p1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move p2, p1

    .line 56
    :goto_1
    and-int/lit8 v1, p1, 0x30

    .line 57
    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    invoke-virtual {v0, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    const/16 v1, 0x20

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    const/16 v1, 0x10

    .line 70
    .line 71
    :goto_2
    or-int/2addr p2, v1

    .line 72
    :cond_3
    and-int/lit16 v1, p1, 0x180

    .line 73
    .line 74
    if-nez v1, :cond_5

    .line 75
    .line 76
    invoke-virtual {v0, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_4

    .line 81
    .line 82
    const/16 v1, 0x100

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    const/16 v1, 0x80

    .line 86
    .line 87
    :goto_3
    or-int/2addr p2, v1

    .line 88
    :cond_5
    and-int/lit16 v1, p1, 0xc00

    .line 89
    .line 90
    if-nez v1, :cond_7

    .line 91
    .line 92
    invoke-virtual {v0, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_6

    .line 97
    .line 98
    const/16 v1, 0x800

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_6
    const/16 v1, 0x400

    .line 102
    .line 103
    :goto_4
    or-int/2addr p2, v1

    .line 104
    :cond_7
    and-int/lit16 p1, p1, 0x6000

    .line 105
    .line 106
    if-nez p1, :cond_9

    .line 107
    .line 108
    invoke-virtual {v0, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_8

    .line 113
    .line 114
    const/16 p1, 0x4000

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_8
    const/16 p1, 0x2000

    .line 118
    .line 119
    :goto_5
    or-int/2addr p2, p1

    .line 120
    :cond_9
    const p1, 0x12493

    .line 121
    .line 122
    .line 123
    and-int/2addr p1, p2

    .line 124
    const v1, 0x12492

    .line 125
    .line 126
    .line 127
    const/4 v3, 0x1

    .line 128
    if-eq p1, v1, :cond_a

    .line 129
    .line 130
    move p1, v3

    .line 131
    goto :goto_6

    .line 132
    :cond_a
    const/4 p1, 0x0

    .line 133
    :goto_6
    and-int/2addr p2, v3

    .line 134
    invoke-virtual {v0, p2, p1}, La/fet;->U(IZ)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_b

    .line 139
    .line 140
    sget-object p1, La/fka;->a:La/zfn;

    .line 141
    .line 142
    iget-object p2, p0, La/b2s;->a:La/l7m0;

    .line 143
    .line 144
    invoke-virtual {p1, p2}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    sget-object p2, La/kr00;->a:La/zfn;

    .line 149
    .line 150
    iget-object v1, p0, La/b2s;->b:La/l7m0;

    .line 151
    .line 152
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {p2, v1}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    filled-new-array {p1, p2}, [La/l5d0;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    new-instance v1, La/fw6;

    .line 165
    .line 166
    const/4 v10, 0x4

    .line 167
    iget-object v3, p0, La/b2s;->c:La/l7m0;

    .line 168
    .line 169
    iget-object v4, p0, La/b2s;->d:La/l7m0;

    .line 170
    .line 171
    iget-object v7, p0, La/b2s;->e:La/j2s;

    .line 172
    .line 173
    invoke-direct/range {v1 .. v10}, La/fw6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 174
    .line 175
    .line 176
    const p0, 0x1e095d55

    .line 177
    .line 178
    .line 179
    invoke-static {p0, v1, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    const/16 p2, 0x30

    .line 184
    .line 185
    invoke-static {p1, p0, v0, p2}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 186
    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_b
    invoke-virtual {v0}, La/fet;->X()V

    .line 190
    .line 191
    .line 192
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    return-object p0
.end method
