.class public final synthetic La/tbd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/z77;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/z77;Lkotlin/jvm/functions/Function1;La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/tbd;->a:B

    iput-object p1, p0, La/tbd;->b:La/z77;

    iput-object p2, p0, La/tbd;->c:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/tbd;->d:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/tbd;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, La/tbd;->d:La/l7m0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v10, p1

    .line 12
    check-cast v10, La/fet;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    and-int/lit8 p2, p1, 0x3

    .line 21
    .line 22
    if-eq p2, v2, :cond_0

    .line 23
    .line 24
    move v1, v3

    .line 25
    :cond_0
    and-int/2addr p1, v3

    .line 26
    invoke-virtual {v10, p1, v1}, La/fet;->U(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    iget-object v9, p0, La/tbd;->c:Lkotlin/jvm/functions/Function1;

    .line 43
    .line 44
    invoke-virtual {v10, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    sget-object p1, La/ukd;->a:La/cl5;

    .line 55
    .line 56
    if-ne p2, p1, :cond_2

    .line 57
    .line 58
    :cond_1
    new-instance p2, La/xv50;

    .line 59
    .line 60
    const/16 p1, 0xf

    .line 61
    .line 62
    invoke-direct {p2, v9, p1}, La/xv50;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v10, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    move-object v8, p2

    .line 69
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 70
    .line 71
    const/4 v11, 0x0

    .line 72
    const/4 v5, 0x0

    .line 73
    iget-object v6, p0, La/tbd;->b:La/z77;

    .line 74
    .line 75
    invoke-static/range {v5 .. v11}, La/ay3;->h(La/mm40;La/z77;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    invoke-virtual {v10}, La/fet;->X()V

    .line 80
    .line 81
    .line 82
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_0
    check-cast p1, La/fet;

    .line 86
    .line 87
    check-cast p2, Ljava/lang/Integer;

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    and-int/lit8 v0, p2, 0x3

    .line 94
    .line 95
    if-eq v0, v2, :cond_4

    .line 96
    .line 97
    move v1, v3

    .line 98
    :cond_4
    and-int/2addr p2, v3

    .line 99
    invoke-virtual {p1, p2, v1}, La/fet;->U(IZ)Z

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-eqz p2, :cond_5

    .line 104
    .line 105
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    check-cast p2, Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    const/4 v0, 0x0

    .line 116
    const/4 v5, 0x0

    .line 117
    iget-object v1, p0, La/tbd;->b:La/z77;

    .line 118
    .line 119
    iget-object v3, p0, La/tbd;->c:Lkotlin/jvm/functions/Function1;

    .line 120
    .line 121
    move-object v4, p1

    .line 122
    invoke-static/range {v0 .. v5}, La/ro4;->S(La/mm40;La/z77;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_5
    move-object v4, p1

    .line 127
    invoke-virtual {v4}, La/fet;->X()V

    .line 128
    .line 129
    .line 130
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
