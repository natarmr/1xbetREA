.class public final synthetic La/xv2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pu90;

.field public final synthetic c:La/pu90;


# direct methods
.method public synthetic constructor <init>(La/pu90;La/pu90;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xv2;->a:B

    iput-object p1, p0, La/xv2;->b:La/pu90;

    iput-object p2, p0, La/xv2;->c:La/pu90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/xv2;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/xv2;->c:La/pu90;

    .line 6
    .line 7
    iget-object p0, p0, La/xv2;->b:La/pu90;

    .line 8
    .line 9
    check-cast p1, La/ou90;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0, v2, v2, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 18
    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    iget p0, p0, La/pu90;->b:I

    .line 23
    .line 24
    invoke-virtual {p1, v3, v2, p0, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 25
    .line 26
    .line 27
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1, p0, v2, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 36
    .line 37
    .line 38
    :cond_1
    if-eqz v3, :cond_3

    .line 39
    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    iget p0, p0, La/pu90;->a:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move p0, v2

    .line 46
    :goto_0
    invoke-virtual {p1, v3, p0, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 47
    .line 48
    .line 49
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    if-eqz p0, :cond_4

    .line 56
    .line 57
    invoke-virtual {p1, p0, v2, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 58
    .line 59
    .line 60
    :cond_4
    if-eqz v3, :cond_6

    .line 61
    .line 62
    if-eqz p0, :cond_5

    .line 63
    .line 64
    iget p0, p0, La/pu90;->a:I

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_5
    move p0, v2

    .line 68
    :goto_1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 69
    .line 70
    const/high16 v0, 0x40800000    # 4.0f

    .line 71
    .line 72
    invoke-interface {p1, v0}, La/w6k;->T(F)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    add-int/2addr v0, p0

    .line 77
    invoke-virtual {p1, v3, v0, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 78
    .line 79
    .line 80
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p0, v2, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 87
    .line 88
    .line 89
    iget p0, p0, La/pu90;->a:I

    .line 90
    .line 91
    invoke-virtual {p1, v3, p0, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, p0, v2, v2, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v3, v2, v2, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, p0, v2, v2, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v3, v2, v2, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 116
    .line 117
    .line 118
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
