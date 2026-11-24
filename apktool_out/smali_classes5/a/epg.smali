.class public final synthetic La/epg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/xdr;

.field public final synthetic d:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/xdr;La/ugd;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/epg;->a:B

    iput-object p1, p0, La/epg;->b:La/l7m0;

    iput-object p2, p0, La/epg;->c:La/xdr;

    iput-object p3, p0, La/epg;->d:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/epg;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/epg;->d:La/ugd;

    .line 5
    .line 6
    iget-object v3, p0, La/epg;->c:La/xdr;

    .line 7
    .line 8
    iget-object p0, p0, La/epg;->b:La/l7m0;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, La/hcz;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/util/List;

    .line 23
    .line 24
    new-instance v0, La/ht80;

    .line 25
    .line 26
    const/16 v4, 0x18

    .line 27
    .line 28
    invoke-direct {v0, v4}, La/ht80;-><init>(B)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    new-instance v5, La/m160;

    .line 36
    .line 37
    const/16 v6, 0x19

    .line 38
    .line 39
    invoke-direct {v5, v0, p0, v6}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    new-instance v0, La/a580;

    .line 43
    .line 44
    const/16 v6, 0xb

    .line 45
    .line 46
    invoke-direct {v0, p0, v6}, La/a580;-><init>(Ljava/util/List;B)V

    .line 47
    .line 48
    .line 49
    new-instance v6, La/ng90;

    .line 50
    .line 51
    const/4 v7, 0x2

    .line 52
    invoke-direct {v6, p0, v3, v2, v7}, La/ng90;-><init>(Ljava/util/List;La/xdr;La/ugd;B)V

    .line 53
    .line 54
    .line 55
    new-instance p0, La/ugd;

    .line 56
    .line 57
    const v2, 0x799532c4

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, v2, v1, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v4, v5, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_0
    move-object v0, p1

    .line 70
    check-cast v0, La/i8z;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/a4x;

    .line 80
    .line 81
    move p1, v1

    .line 82
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    move-object v4, v2

    .line 87
    new-instance v2, La/oea;

    .line 88
    .line 89
    const/4 v5, 0x3

    .line 90
    invoke-direct {v2, p0, v5}, La/oea;-><init>(La/a4x;B)V

    .line 91
    .line 92
    .line 93
    move-object v5, v3

    .line 94
    new-instance v3, La/eod;

    .line 95
    .line 96
    const/16 v6, 0x17

    .line 97
    .line 98
    invoke-direct {v3, v5, p0, v6}, La/eod;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 99
    .line 100
    .line 101
    move-object v5, v4

    .line 102
    new-instance v4, La/oea;

    .line 103
    .line 104
    const/4 v6, 0x4

    .line 105
    invoke-direct {v4, p0, v6}, La/oea;-><init>(La/a4x;B)V

    .line 106
    .line 107
    .line 108
    new-instance v6, La/fpg;

    .line 109
    .line 110
    const/4 v7, 0x0

    .line 111
    invoke-direct {v6, v5, p0, v7}, La/fpg;-><init>(La/ugd;La/a4x;B)V

    .line 112
    .line 113
    .line 114
    new-instance v5, La/ugd;

    .line 115
    .line 116
    const p0, 0x3cd1baf1

    .line 117
    .line 118
    .line 119
    invoke-direct {v5, p0, p1, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v0 .. v5}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 123
    .line 124
    .line 125
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
