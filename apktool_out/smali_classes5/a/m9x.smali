.class public final synthetic La/m9x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/l7m0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;F)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/m9x;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m9x;->d:Ljava/lang/Object;

    iput-object p2, p0, La/m9x;->e:Ljava/lang/Object;

    iput-object p3, p0, La/m9x;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La/m9x;->f:Ljava/lang/Object;

    iput p5, p0, La/m9x;->b:F

    return-void
.end method

.method public synthetic constructor <init>(La/mie0;FLa/z63;La/l73;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/m9x;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m9x;->d:Ljava/lang/Object;

    iput p2, p0, La/m9x;->b:F

    iput-object p3, p0, La/m9x;->e:Ljava/lang/Object;

    iput-object p4, p0, La/m9x;->f:Ljava/lang/Object;

    iput-object p5, p0, La/m9x;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;FLa/a4x;La/ucr0;)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput-byte v0, p0, La/m9x;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m9x;->d:Ljava/lang/Object;

    iput-object p2, p0, La/m9x;->c:Lkotlin/jvm/functions/Function1;

    iput p3, p0, La/m9x;->b:F

    iput-object p4, p0, La/m9x;->e:Ljava/lang/Object;

    iput-object p5, p0, La/m9x;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/m9x;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/m9x;->f:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p0, La/m9x;->e:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, La/m9x;->d:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v6, v4

    .line 14
    check-cast v6, Ljava/util/List;

    .line 15
    .line 16
    move-object v9, v3

    .line 17
    check-cast v9, La/a4x;

    .line 18
    .line 19
    move-object v10, v2

    .line 20
    check-cast v10, La/ucr0;

    .line 21
    .line 22
    check-cast p1, La/hcz;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v0, La/meo0;

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    invoke-direct {v0, v2}, La/meo0;-><init>(B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v6, v0}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    new-instance v3, La/adn0;

    .line 42
    .line 43
    const/4 v4, 0x5

    .line 44
    invoke-direct {v3, v0, v4}, La/adn0;-><init>(Ljava/util/List;B)V

    .line 45
    .line 46
    .line 47
    new-instance v0, La/adn0;

    .line 48
    .line 49
    const/4 v4, 0x6

    .line 50
    invoke-direct {v0, v6, v4}, La/adn0;-><init>(Ljava/util/List;B)V

    .line 51
    .line 52
    .line 53
    new-instance v5, La/d7s;

    .line 54
    .line 55
    iget-object v7, p0, La/m9x;->c:Lkotlin/jvm/functions/Function1;

    .line 56
    .line 57
    iget v8, p0, La/m9x;->b:F

    .line 58
    .line 59
    invoke-direct/range {v5 .. v10}, La/d7s;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;FLa/a4x;La/ucr0;)V

    .line 60
    .line 61
    .line 62
    new-instance p0, La/ugd;

    .line 63
    .line 64
    const v4, -0x4e295cff

    .line 65
    .line 66
    .line 67
    invoke-direct {p0, v4, v1, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v2, v3, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_0
    check-cast v4, La/mie0;

    .line 77
    .line 78
    move-object v9, v3

    .line 79
    check-cast v9, La/z63;

    .line 80
    .line 81
    move-object v10, v2

    .line 82
    check-cast v10, La/l73;

    .line 83
    .line 84
    check-cast p1, Ljava/lang/Long;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v6

    .line 90
    iget-object p1, v4, La/mie0;->a:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-object v5, p1

    .line 96
    check-cast v5, La/i73;

    .line 97
    .line 98
    iget v8, p0, La/m9x;->b:F

    .line 99
    .line 100
    iget-object v11, p0, La/m9x;->c:Lkotlin/jvm/functions/Function1;

    .line 101
    .line 102
    invoke-static/range {v5 .. v11}, La/hhm0;->t(La/i73;JFLa/z63;La/l73;Lkotlin/jvm/functions/Function1;)V

    .line 103
    .line 104
    .line 105
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_1
    check-cast v4, La/l7m0;

    .line 109
    .line 110
    move-object v7, v3

    .line 111
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 112
    .line 113
    move-object v9, v2

    .line 114
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 115
    .line 116
    check-cast p1, La/hcz;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, La/pjs;

    .line 126
    .line 127
    iget-object v6, v0, La/pjs;->g:La/a4x;

    .line 128
    .line 129
    new-instance v0, La/v1x;

    .line 130
    .line 131
    const/16 v2, 0xa

    .line 132
    .line 133
    invoke-direct {v0, v2}, La/v1x;-><init>(B)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    new-instance v3, La/d2p;

    .line 141
    .line 142
    const/16 v4, 0x1a

    .line 143
    .line 144
    invoke-direct {v3, v0, v6, v4}, La/d2p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 145
    .line 146
    .line 147
    new-instance v0, La/ubn;

    .line 148
    .line 149
    const/4 v4, 0x7

    .line 150
    invoke-direct {v0, v6, v4}, La/ubn;-><init>(La/a4x;B)V

    .line 151
    .line 152
    .line 153
    new-instance v5, La/d7s;

    .line 154
    .line 155
    iget-object v8, p0, La/m9x;->c:Lkotlin/jvm/functions/Function1;

    .line 156
    .line 157
    iget v10, p0, La/m9x;->b:F

    .line 158
    .line 159
    invoke-direct/range {v5 .. v10}, La/d7s;-><init>(La/a4x;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;F)V

    .line 160
    .line 161
    .line 162
    new-instance p0, La/ugd;

    .line 163
    .line 164
    const v4, 0x799532c4

    .line 165
    .line 166
    .line 167
    invoke-direct {p0, v4, v1, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, v2, v3, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 171
    .line 172
    .line 173
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object p0

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
