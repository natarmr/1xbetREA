.class public final synthetic La/qea;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/tea;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/tea;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/qea;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qea;->b:La/mm40;

    iput-object p2, p0, La/qea;->c:La/tea;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/tea;I)V
    .locals 0

    .line 2
    const/4 p3, 0x1

    iput-byte p3, p0, La/qea;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qea;->b:La/mm40;

    iput-object p2, p0, La/qea;->c:La/tea;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/qea;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/qea;->c:La/tea;

    .line 5
    .line 6
    iget-object p0, p0, La/qea;->b:La/mm40;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/fet;

    .line 12
    .line 13
    check-cast p2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-static {p0, v2, p1, p2}, La/fre0;->l(La/mm40;La/tea;La/fet;I)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    move-object v5, p1

    .line 29
    check-cast v5, La/fet;

    .line 30
    .line 31
    check-cast p2, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    and-int/lit8 p2, p1, 0x3

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    const/4 v3, 0x0

    .line 41
    if-eq p2, v0, :cond_0

    .line 42
    .line 43
    move p2, v1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move p2, v3

    .line 46
    :goto_0
    and-int/2addr p1, v1

    .line 47
    invoke-virtual {v5, p1, p2}, La/fet;->U(IZ)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    sget-object p1, La/uc9;->c:La/mw3;

    .line 54
    .line 55
    sget-object p2, La/gqw0;->m:La/xx7;

    .line 56
    .line 57
    invoke-static {p1, p2, v5, v3}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-wide v6, v5, La/fet;->T:J

    .line 62
    .line 63
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v5, p0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    sget-object v4, La/mkd;->c0:La/gqw0;

    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, La/fet;->i0()V

    .line 81
    .line 82
    .line 83
    iget-boolean v4, v5, La/fet;->S:Z

    .line 84
    .line 85
    if-eqz v4, :cond_1

    .line 86
    .line 87
    sget-object v4, La/e7z;->u1:La/pcy;

    .line 88
    .line 89
    invoke-virtual {v5, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    invoke-virtual {v5}, La/fet;->r0()V

    .line 94
    .line 95
    .line 96
    :goto_1
    sget-object v4, La/gqw0;->x:La/shd;

    .line 97
    .line 98
    invoke-static {v5, p1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 99
    .line 100
    .line 101
    sget-object p1, La/gqw0;->w:La/shd;

    .line 102
    .line 103
    invoke-static {v5, v0, p1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    sget-object p2, La/gqw0;->y:La/shd;

    .line 111
    .line 112
    invoke-static {v5, p1, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v5}, La/jpm0;->n(La/fet;)V

    .line 116
    .line 117
    .line 118
    sget-object p1, La/gqw0;->v:La/shd;

    .line 119
    .line 120
    invoke-static {v5, p0, p1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 121
    .line 122
    .line 123
    iget p0, v2, La/tea;->b:I

    .line 124
    .line 125
    iget p1, v2, La/tea;->c:I

    .line 126
    .line 127
    const/4 p2, 0x0

    .line 128
    invoke-static {p2, p0, p1, v5, v3}, La/fre0;->k(La/mm40;IILa/fet;I)V

    .line 129
    .line 130
    .line 131
    iget-object v7, v2, La/tea;->d:Ljava/lang/String;

    .line 132
    .line 133
    iget-wide v3, v2, La/tea;->e:J

    .line 134
    .line 135
    sget-object p0, La/jm40;->b:La/jm40;

    .line 136
    .line 137
    const/high16 p1, 0x3f800000    # 1.0f

    .line 138
    .line 139
    invoke-static {p0, p1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    const/4 v2, 0x6

    .line 144
    invoke-static/range {v2 .. v7}, La/fre0;->n(IJLa/fet;La/mm40;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5, v1}, La/fet;->r(Z)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_2
    invoke-virtual {v5}, La/fet;->X()V

    .line 152
    .line 153
    .line 154
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 155
    .line 156
    return-object p0

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
