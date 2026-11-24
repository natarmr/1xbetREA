.class public final synthetic La/p040;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/o2c0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/o2c0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/p040;->a:B

    iput-object p1, p0, La/p040;->b:La/o2c0;

    iput-object p2, p0, La/p040;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/p040;->a:B

    .line 2
    .line 3
    sget-object v1, La/ukd;->a:La/cl5;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/p040;->c:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    iget-object p0, p0, La/p040;->b:La/o2c0;

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v10, p1

    .line 16
    check-cast v10, La/fet;

    .line 17
    .line 18
    check-cast p2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    and-int/lit8 p2, p1, 0x3

    .line 25
    .line 26
    if-eq p2, v5, :cond_0

    .line 27
    .line 28
    move v2, v3

    .line 29
    :cond_0
    and-int/2addr p1, v3

    .line 30
    invoke-virtual {v10, p1, v2}, La/fet;->U(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    iget-object v7, p0, La/o2c0;->a:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v8, p0, La/o2c0;->b:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v10, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-nez p0, :cond_1

    .line 49
    .line 50
    if-ne p1, v1, :cond_2

    .line 51
    .line 52
    :cond_1
    new-instance p1, La/m040;

    .line 53
    .line 54
    const/4 p0, 0x3

    .line 55
    invoke-direct {p1, v4, p0}, La/m040;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v10, p1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    move-object v9, p1

    .line 62
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 63
    .line 64
    const/4 v11, 0x0

    .line 65
    const/4 v6, 0x0

    .line 66
    invoke-static/range {v6 .. v11}, La/p8a;->z(La/mm40;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    invoke-virtual {v10}, La/fet;->X()V

    .line 71
    .line 72
    .line 73
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_0
    move-object v7, p1

    .line 77
    check-cast v7, La/fet;

    .line 78
    .line 79
    check-cast p2, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    and-int/lit8 p2, p1, 0x3

    .line 86
    .line 87
    if-eq p2, v5, :cond_4

    .line 88
    .line 89
    move v2, v3

    .line 90
    :cond_4
    and-int/2addr p1, v3

    .line 91
    invoke-virtual {v7, p1, v2}, La/fet;->U(IZ)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_7

    .line 96
    .line 97
    sget-object p1, La/jm40;->b:La/jm40;

    .line 98
    .line 99
    const-string p2, "PROFILE_MENU_ICON"

    .line 100
    .line 101
    invoke-static {p1, p2}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    move-object p1, v1

    .line 106
    iget-object v1, p0, La/o2c0;->c:La/o0x;

    .line 107
    .line 108
    iget v2, p0, La/o2c0;->d:I

    .line 109
    .line 110
    iget-object v3, p0, La/o2c0;->e:La/y3d;

    .line 111
    .line 112
    iget-wide v8, p0, La/o2c0;->f:J

    .line 113
    .line 114
    invoke-virtual {v7, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    if-nez p0, :cond_5

    .line 123
    .line 124
    if-ne p2, p1, :cond_6

    .line 125
    .line 126
    :cond_5
    new-instance p2, La/m040;

    .line 127
    .line 128
    invoke-direct {p2, v4, v5}, La/m040;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_6
    move-object v6, p2

    .line 135
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 136
    .line 137
    move-wide v4, v8

    .line 138
    const/4 v8, 0x6

    .line 139
    invoke-static/range {v0 .. v8}, La/p8a;->A(La/mm40;La/o0x;ILa/y3d;JLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_7
    invoke-virtual {v7}, La/fet;->X()V

    .line 144
    .line 145
    .line 146
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
