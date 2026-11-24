.class public final synthetic La/m6b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ugd;

.field public final synthetic c:La/e7b;


# direct methods
.method public synthetic constructor <init>(La/ugd;La/e7b;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/m6b;->a:B

    iput-object p1, p0, La/m6b;->b:La/ugd;

    iput-object p2, p0, La/m6b;->c:La/e7b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/m6b;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x12

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x1

    .line 9
    iget-object v6, p0, La/m6b;->c:La/e7b;

    .line 10
    .line 11
    iget-object p0, p0, La/m6b;->b:La/ugd;

    .line 12
    .line 13
    check-cast p1, Lorg/xplatform/related/api/presentation/RelatedParams;

    .line 14
    .line 15
    check-cast p2, La/fet;

    .line 16
    .line 17
    check-cast p3, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    and-int/lit8 v0, p3, 0x6

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    move v3, v4

    .line 40
    :cond_0
    or-int/2addr p3, v3

    .line 41
    :cond_1
    and-int/lit8 v0, p3, 0x13

    .line 42
    .line 43
    if-eq v0, v2, :cond_2

    .line 44
    .line 45
    move v1, v5

    .line 46
    :cond_2
    and-int/lit8 v0, p3, 0x1

    .line 47
    .line 48
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    check-cast v6, La/w6b;

    .line 55
    .line 56
    invoke-interface {v6}, La/w6b;->b()La/udl0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    shl-int/lit8 p3, p3, 0x3

    .line 61
    .line 62
    and-int/lit8 p3, p3, 0x70

    .line 63
    .line 64
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    invoke-virtual {p0, v0, p1, p2, p3}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 73
    .line 74
    .line 75
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    and-int/lit8 v0, p3, 0x6

    .line 82
    .line 83
    if-nez v0, :cond_5

    .line 84
    .line 85
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    move v3, v4

    .line 92
    :cond_4
    or-int/2addr p3, v3

    .line 93
    :cond_5
    and-int/lit8 v0, p3, 0x13

    .line 94
    .line 95
    if-eq v0, v2, :cond_6

    .line 96
    .line 97
    move v1, v5

    .line 98
    :cond_6
    and-int/lit8 v0, p3, 0x1

    .line 99
    .line 100
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_7

    .line 105
    .line 106
    check-cast v6, La/d7b;

    .line 107
    .line 108
    invoke-interface {v6}, La/d7b;->b()La/udl0;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    shl-int/lit8 p3, p3, 0x3

    .line 113
    .line 114
    and-int/lit8 p3, p3, 0x70

    .line 115
    .line 116
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    invoke-virtual {p0, v0, p1, p2, p3}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 125
    .line 126
    .line 127
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p0

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
