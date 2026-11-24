.class public final synthetic La/l0i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zpl;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/zpl;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/l0i;->a:B

    iput-object p1, p0, La/l0i;->b:La/zpl;

    iput-object p2, p0, La/l0i;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/l0i;->a:B

    .line 2
    .line 3
    const v1, -0x4e295cff

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    iget-object v3, p0, La/l0i;->c:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    iget-object p0, p0, La/l0i;->b:La/zpl;

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    check-cast p1, La/hcz;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/zpl;->c:La/a4x;

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    new-instance v1, La/bzh;

    .line 27
    .line 28
    const/4 v5, 0x4

    .line 29
    invoke-direct {v1, p0, v5}, La/bzh;-><init>(Ljava/util/List;B)V

    .line 30
    .line 31
    .line 32
    new-instance v5, La/o0i;

    .line 33
    .line 34
    invoke-direct {v5, p0, v3, v2}, La/o0i;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function2;B)V

    .line 35
    .line 36
    .line 37
    new-instance p0, La/ugd;

    .line 38
    .line 39
    const v2, 0x799532c4

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v2, v4, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-virtual {p1, v0, v2, v1, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, La/zpl;->c:La/a4x;

    .line 56
    .line 57
    new-instance v0, La/m7h;

    .line 58
    .line 59
    const/16 v5, 0x19

    .line 60
    .line 61
    invoke-direct {v0, v5}, La/m7h;-><init>(B)V

    .line 62
    .line 63
    .line 64
    new-instance v5, La/m7h;

    .line 65
    .line 66
    const/16 v6, 0x1a

    .line 67
    .line 68
    invoke-direct {v5, v6}, La/m7h;-><init>(B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v0}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    new-instance v7, La/bzh;

    .line 80
    .line 81
    invoke-direct {v7, v0, v2}, La/bzh;-><init>(Ljava/util/List;B)V

    .line 82
    .line 83
    .line 84
    new-instance v0, La/vtf;

    .line 85
    .line 86
    const/16 v2, 0xc

    .line 87
    .line 88
    invoke-direct {v0, v5, p0, v2}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 89
    .line 90
    .line 91
    new-instance v2, La/o0i;

    .line 92
    .line 93
    invoke-direct {v2, p0, v3, v4}, La/o0i;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function2;B)V

    .line 94
    .line 95
    .line 96
    new-instance p0, La/ugd;

    .line 97
    .line 98
    invoke-direct {p0, v1, v4, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v6, v7, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 102
    .line 103
    .line 104
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object p0, p0, La/zpl;->c:La/a4x;

    .line 111
    .line 112
    new-instance v0, La/m7h;

    .line 113
    .line 114
    const/16 v2, 0x17

    .line 115
    .line 116
    invoke-direct {v0, v2}, La/m7h;-><init>(B)V

    .line 117
    .line 118
    .line 119
    new-instance v2, La/m7h;

    .line 120
    .line 121
    const/16 v5, 0x18

    .line 122
    .line 123
    invoke-direct {v2, v5}, La/m7h;-><init>(B)V

    .line 124
    .line 125
    .line 126
    invoke-static {p0, v0}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    new-instance v6, La/bzh;

    .line 135
    .line 136
    invoke-direct {v6, v0, v4}, La/bzh;-><init>(Ljava/util/List;B)V

    .line 137
    .line 138
    .line 139
    new-instance v0, La/vtf;

    .line 140
    .line 141
    const/16 v7, 0xb

    .line 142
    .line 143
    invoke-direct {v0, v2, p0, v7}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    new-instance v2, La/o0i;

    .line 147
    .line 148
    const/4 v7, 0x0

    .line 149
    invoke-direct {v2, p0, v3, v7}, La/o0i;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function2;B)V

    .line 150
    .line 151
    .line 152
    new-instance p0, La/ugd;

    .line 153
    .line 154
    invoke-direct {p0, v1, v4, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v5, v6, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 158
    .line 159
    .line 160
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    return-object p0

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
