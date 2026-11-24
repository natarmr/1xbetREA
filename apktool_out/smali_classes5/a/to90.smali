.class public final synthetic La/to90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/yi90;


# direct methods
.method public synthetic constructor <init>(La/yi90;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/to90;->a:B

    iput-object p1, p0, La/to90;->b:La/yi90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/to90;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    iget-object p0, p0, La/to90;->b:La/yi90;

    .line 5
    .line 6
    check-cast p1, La/cp;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    check-cast v0, La/twx;

    .line 17
    .line 18
    iget-object v0, v0, La/twx;->c:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 19
    .line 20
    new-instance v2, La/ro90;

    .line 21
    .line 22
    invoke-direct {v2, p0, p1, v1}, La/ro90;-><init>(La/yi90;La/cp;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 26
    .line 27
    .line 28
    new-instance p0, La/ui80;

    .line 29
    .line 30
    const/4 v0, 0x7

    .line 31
    invoke-direct {p0, p1, v0}, La/ui80;-><init>(La/cp;B)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 44
    .line 45
    check-cast v0, La/qwx;

    .line 46
    .line 47
    iget-object v0, v0, La/qwx;->d:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 48
    .line 49
    new-instance v1, La/ro90;

    .line 50
    .line 51
    const/4 v2, 0x2

    .line 52
    invoke-direct {v1, p0, p1, v2}, La/ro90;-><init>(La/yi90;La/cp;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 56
    .line 57
    .line 58
    new-instance p0, La/ui80;

    .line 59
    .line 60
    const/4 v0, 0x6

    .line 61
    invoke-direct {p0, p1, v0}, La/ui80;-><init>(La/cp;B)V

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
    check-cast v0, La/rwx;

    .line 76
    .line 77
    iget-object v0, v0, La/rwx;->a:Landroid/widget/FrameLayout;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance v1, La/ro90;

    .line 83
    .line 84
    const/4 v2, 0x1

    .line 85
    invoke-direct {v1, p0, p1, v2}, La/ro90;-><init>(La/yi90;La/cp;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 89
    .line 90
    .line 91
    new-instance p0, La/ui80;

    .line 92
    .line 93
    const/4 v0, 0x4

    .line 94
    invoke-direct {p0, p1, v0}, La/ui80;-><init>(La/cp;B)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 98
    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 107
    .line 108
    check-cast v0, La/pwx;

    .line 109
    .line 110
    iget-object v0, v0, La/pwx;->d:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 111
    .line 112
    new-instance v2, La/ro90;

    .line 113
    .line 114
    const/4 v3, 0x0

    .line 115
    invoke-direct {v2, p0, p1, v3}, La/ro90;-><init>(La/yi90;La/cp;B)V

    .line 116
    .line 117
    .line 118
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 119
    .line 120
    .line 121
    new-instance p0, La/ui80;

    .line 122
    .line 123
    invoke-direct {p0, p1, v1}, La/ui80;-><init>(La/cp;B)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 127
    .line 128
    .line 129
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p0

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
