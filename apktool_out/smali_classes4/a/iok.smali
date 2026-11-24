.class public final synthetic La/iok;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wyg;


# direct methods
.method public synthetic constructor <init>(La/wyg;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/iok;->a:B

    iput-object p1, p0, La/iok;->b:La/wyg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/iok;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, La/iok;->b:La/wyg;

    .line 6
    .line 7
    check-cast p1, La/cp;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v1, La/nwr0;

    .line 21
    .line 22
    invoke-direct {v1, p0, p1, v2}, La/nwr0;-><init>(La/wyg;La/cp;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 26
    .line 27
    .line 28
    new-instance p0, La/kzi0;

    .line 29
    .line 30
    const/16 v0, 0x17

    .line 31
    .line 32
    invoke-direct {p0, p1, v0}, La/kzi0;-><init>(La/cp;B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v2, La/nwr0;

    .line 50
    .line 51
    invoke-direct {v2, p0, p1, v1}, La/nwr0;-><init>(La/wyg;La/cp;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 55
    .line 56
    .line 57
    new-instance p0, La/kzi0;

    .line 58
    .line 59
    const/16 v0, 0x15

    .line 60
    .line 61
    invoke-direct {p0, p1, v0}, La/kzi0;-><init>(La/cp;B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 74
    .line 75
    check-cast v0, La/zth;

    .line 76
    .line 77
    iget-object v0, v0, La/zth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 78
    .line 79
    new-instance v1, La/jok;

    .line 80
    .line 81
    const/4 v2, 0x2

    .line 82
    invoke-direct {v1, p0, p1, v2}, La/jok;-><init>(La/wyg;La/cp;B)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    .line 87
    .line 88
    new-instance p0, La/kzi0;

    .line 89
    .line 90
    const/16 v0, 0xb

    .line 91
    .line 92
    invoke-direct {p0, p1, v0}, La/kzi0;-><init>(La/cp;B)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 96
    .line 97
    .line 98
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 105
    .line 106
    check-cast v0, La/yth;

    .line 107
    .line 108
    iget-object v0, v0, La/yth;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 109
    .line 110
    new-instance v1, La/jok;

    .line 111
    .line 112
    invoke-direct {v1, p0, p1, v2}, La/jok;-><init>(La/wyg;La/cp;B)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/header/DsHeader;->setButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 116
    .line 117
    .line 118
    new-instance p0, La/ctv;

    .line 119
    .line 120
    invoke-direct {p0, p1, p1, v2}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 124
    .line 125
    .line 126
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 133
    .line 134
    check-cast v0, La/xth;

    .line 135
    .line 136
    iget-object v0, v0, La/xth;->a:Lorg/xplatform/uikit_sport/sport_cell/DsSportCell;

    .line 137
    .line 138
    new-instance v2, La/jok;

    .line 139
    .line 140
    invoke-direct {v2, p0, p1, v1}, La/jok;-><init>(La/wyg;La/cp;B)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    .line 145
    .line 146
    new-instance p0, La/kgh;

    .line 147
    .line 148
    const/16 v0, 0x9

    .line 149
    .line 150
    invoke-direct {p0, p1, v0}, La/kgh;-><init>(La/cp;B)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 154
    .line 155
    .line 156
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
