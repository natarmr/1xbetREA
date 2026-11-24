.class public final synthetic La/xss;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/gts;

.field public final synthetic b:La/sek;

.field public final synthetic c:La/bek;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/gts;La/sek;La/bek;JJLkotlin/jvm/functions/Function1;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xss;->a:La/gts;

    iput-object p2, p0, La/xss;->b:La/sek;

    iput-object p3, p0, La/xss;->c:La/bek;

    iput-wide p4, p0, La/xss;->d:J

    iput-wide p6, p0, La/xss;->e:J

    iput-object p8, p0, La/xss;->f:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, La/xss;->g:La/pz40;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, La/ir8;

    .line 2
    .line 3
    move-object v5, p2

    .line 4
    check-cast v5, La/fet;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    and-int/lit8 p3, p2, 0x6

    .line 16
    .line 17
    if-nez p3, :cond_1

    .line 18
    .line 19
    invoke-virtual {v5, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    const/4 p3, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p3, 0x2

    .line 28
    :goto_0
    or-int/2addr p2, p3

    .line 29
    :cond_1
    and-int/lit8 p3, p2, 0x13

    .line 30
    .line 31
    const/16 v0, 0x12

    .line 32
    .line 33
    const/4 v7, 0x1

    .line 34
    const/4 v9, 0x0

    .line 35
    if-eq p3, v0, :cond_2

    .line 36
    .line 37
    move p3, v7

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move p3, v9

    .line 40
    :goto_1
    and-int/2addr p2, v7

    .line 41
    invoke-virtual {v5, p2, p3}, La/fet;->U(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_a

    .line 46
    .line 47
    sget-object p2, La/jm40;->b:La/jm40;

    .line 48
    .line 49
    invoke-interface {p1, p2}, La/ir8;->a(La/mm40;)La/mm40;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object p3, p0, La/xss;->g:La/pz40;

    .line 54
    .line 55
    invoke-interface {p3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    move-object v2, v1

    .line 60
    check-cast v2, La/bts;

    .line 61
    .line 62
    const/4 v6, 0x0

    .line 63
    iget-object v1, p0, La/xss;->a:La/gts;

    .line 64
    .line 65
    iget-object v3, p0, La/xss;->b:La/sek;

    .line 66
    .line 67
    iget-object v4, p0, La/xss;->c:La/bek;

    .line 68
    .line 69
    invoke-static/range {v0 .. v6}, La/zss;->c(La/mm40;La/gts;La/bts;La/sek;La/bek;La/fet;I)V

    .line 70
    .line 71
    .line 72
    if-eqz v1, :cond_6

    .line 73
    .line 74
    invoke-interface {p3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    check-cast p3, La/bts;

    .line 79
    .line 80
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    if-eqz p3, :cond_4

    .line 85
    .line 86
    if-ne p3, v7, :cond_3

    .line 87
    .line 88
    iget-object p3, v1, La/gts;->b:La/fts;

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 92
    .line 93
    .line 94
    const/4 p0, 0x0

    .line 95
    return-object p0

    .line 96
    :cond_4
    iget-object p3, v1, La/gts;->a:La/fts;

    .line 97
    .line 98
    :goto_2
    instance-of p3, p3, La/ets;

    .line 99
    .line 100
    if-nez p3, :cond_5

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_5
    const p0, -0x83640d3

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5, p0}, La/fet;->e0(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5, v9}, La/fet;->r(Z)V

    .line 110
    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_6
    :goto_3
    const p3, -0x83b7cf8

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5, p3}, La/fet;->e0(I)V

    .line 117
    .line 118
    .line 119
    invoke-interface {p1, p2}, La/ir8;->a(La/mm40;)La/mm40;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-nez v1, :cond_7

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_7
    move v7, v9

    .line 127
    :goto_4
    iget-object p1, p0, La/xss;->f:Lkotlin/jvm/functions/Function1;

    .line 128
    .line 129
    invoke-virtual {v5, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    if-nez p2, :cond_8

    .line 138
    .line 139
    sget-object p2, La/ukd;->a:La/cl5;

    .line 140
    .line 141
    if-ne p3, p2, :cond_9

    .line 142
    .line 143
    :cond_8
    new-instance p3, La/hcr;

    .line 144
    .line 145
    const/16 p2, 0x19

    .line 146
    .line 147
    invoke-direct {p3, p1, p2}, La/hcr;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v5, p3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_9
    move-object v6, p3

    .line 154
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 155
    .line 156
    const/4 v8, 0x0

    .line 157
    iget-wide v1, p0, La/xss;->d:J

    .line 158
    .line 159
    iget-wide v3, p0, La/xss;->e:J

    .line 160
    .line 161
    move v10, v7

    .line 162
    move-object v7, v5

    .line 163
    move v5, v10

    .line 164
    invoke-static/range {v0 .. v8}, La/zss;->a(La/mm40;JJZLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 165
    .line 166
    .line 167
    move-object v5, v7

    .line 168
    invoke-virtual {v5, v9}, La/fet;->r(Z)V

    .line 169
    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_a
    invoke-virtual {v5}, La/fet;->X()V

    .line 173
    .line 174
    .line 175
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    return-object p0
.end method
