.class public final synthetic La/sp00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bq00;


# direct methods
.method public synthetic constructor <init>(La/bq00;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sp00;->a:B

    iput-object p1, p0, La/sp00;->b:La/bq00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/sp00;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/sp00;->b:La/bq00;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v8

    .line 15
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 16
    .line 17
    iget-object v10, p1, La/ocj;->a:La/p7m0;

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, La/i3t0;->f:La/oyg0;

    .line 27
    .line 28
    move-object v1, v0

    .line 29
    move-object v0, p1

    .line 30
    check-cast v0, La/cp00;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    const v9, 0x1f7ff

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-static/range {v0 .. v9}, La/cp00;->a(La/cp00;La/iy3;Ljava/util/ArrayList;La/ne5;La/oc5;Ljava/lang/String;Ljava/util/Set;ZZI)La/cp00;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v10, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    if-eqz v8, :cond_2

    .line 56
    .line 57
    iget-object p0, p0, La/bq00;->l0:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, La/bby;

    .line 74
    .line 75
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 80
    .line 81
    .line 82
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_0
    check-cast p1, La/im3;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iget-object p0, p0, La/bq00;->j0:La/p7m0;

    .line 91
    .line 92
    new-instance v0, La/pf50;

    .line 93
    .line 94
    invoke-direct {v0, p1}, La/pf50;-><init>(La/im3;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    new-instance v0, La/wp00;

    .line 112
    .line 113
    const/4 v2, 0x0

    .line 114
    invoke-direct {v0, p0, p1, v1, v2}, La/wp00;-><init>(La/bq00;Ljava/lang/String;La/yje;B)V

    .line 115
    .line 116
    .line 117
    const/4 v2, 0x3

    .line 118
    invoke-static {p0, v1, v1, v0, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 119
    .line 120
    .line 121
    new-instance v0, La/wp00;

    .line 122
    .line 123
    const/4 v3, 0x1

    .line 124
    invoke-direct {v0, p0, p1, v1, v3}, La/wp00;-><init>(La/bq00;Ljava/lang/String;La/yje;B)V

    .line 125
    .line 126
    .line 127
    invoke-static {p0, v1, v1, v0, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 128
    .line 129
    .line 130
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
