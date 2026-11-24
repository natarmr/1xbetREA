.class public final synthetic La/l630;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pw20;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/pw20;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/l630;->a:B

    iput-object p1, p0, La/l630;->b:La/pw20;

    iput-object p2, p0, La/l630;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/l630;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, La/l630;->b:La/pw20;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v8, p1

    .line 12
    check-cast v8, La/fet;

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
    invoke-virtual {v8, p1, v1}, La/fet;->U(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object v6, v4, La/pw20;->e:La/prm;

    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v10, 0x1

    .line 36
    const/4 v5, 0x0

    .line 37
    iget-object v7, p0, La/l630;->c:Lkotlin/jvm/functions/Function1;

    .line 38
    .line 39
    invoke-static/range {v5 .. v10}, La/qcc;->k(La/mm40;La/prm;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v8}, La/fet;->X()V

    .line 44
    .line 45
    .line 46
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    check-cast p1, La/fet;

    .line 50
    .line 51
    check-cast p2, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    and-int/lit8 v0, p2, 0x3

    .line 58
    .line 59
    if-eq v0, v2, :cond_2

    .line 60
    .line 61
    move v1, v3

    .line 62
    :cond_2
    and-int/2addr p2, v3

    .line 63
    invoke-virtual {p1, p2, v1}, La/fet;->U(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_3

    .line 68
    .line 69
    iget-object v1, v4, La/pw20;->d:La/prm;

    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    const/4 v5, 0x1

    .line 73
    const/4 v0, 0x0

    .line 74
    iget-object v2, p0, La/l630;->c:Lkotlin/jvm/functions/Function1;

    .line 75
    .line 76
    move-object v3, p1

    .line 77
    invoke-static/range {v0 .. v5}, La/qcc;->k(La/mm40;La/prm;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    move-object v3, p1

    .line 82
    invoke-virtual {v3}, La/fet;->X()V

    .line 83
    .line 84
    .line 85
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_1
    check-cast p1, La/fet;

    .line 89
    .line 90
    check-cast p2, Ljava/lang/Integer;

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    and-int/lit8 v0, p2, 0x3

    .line 97
    .line 98
    if-eq v0, v2, :cond_4

    .line 99
    .line 100
    move v1, v3

    .line 101
    :cond_4
    and-int/2addr p2, v3

    .line 102
    invoke-virtual {p1, p2, v1}, La/fet;->U(IZ)Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    if-eqz p2, :cond_5

    .line 107
    .line 108
    iget-object v1, v4, La/pw20;->c:La/prm;

    .line 109
    .line 110
    const/4 v4, 0x0

    .line 111
    const/4 v5, 0x1

    .line 112
    const/4 v0, 0x0

    .line 113
    iget-object v2, p0, La/l630;->c:Lkotlin/jvm/functions/Function1;

    .line 114
    .line 115
    move-object v3, p1

    .line 116
    invoke-static/range {v0 .. v5}, La/qcc;->k(La/mm40;La/prm;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_5
    move-object v3, p1

    .line 121
    invoke-virtual {v3}, La/fet;->X()V

    .line 122
    .line 123
    .line 124
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
