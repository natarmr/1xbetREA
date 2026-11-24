.class public final synthetic La/n2j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/n2j0;->a:B

    iput-object p1, p0, La/n2j0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/n2j0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/n2j0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-byte p1, p0, La/n2j0;->a:B

    .line 2
    .line 3
    iget-object v0, p0, La/n2j0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, La/n2j0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, La/n2j0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/bvy;

    .line 13
    .line 14
    check-cast v1, La/rvy;

    .line 15
    .line 16
    check-cast v0, La/avy;

    .line 17
    .line 18
    iget-object p0, p0, La/bvy;->f:Lkotlin/jvm/functions/Function2;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object p1, v0, La/avy;->u:La/n0o0;

    .line 24
    .line 25
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, La/fvy;

    .line 30
    .line 31
    invoke-virtual {p1}, La/fvy;->getLoadedPictureUrl()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p0, v1, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_0
    check-cast p0, La/h2j0;

    .line 40
    .line 41
    check-cast v1, La/cp;

    .line 42
    .line 43
    check-cast v0, La/w5j0;

    .line 44
    .line 45
    iget-object p0, p0, La/h2j0;->c:La/dc3;

    .line 46
    .line 47
    iget-object p0, p0, La/dc3;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;

    .line 50
    .line 51
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, La/m2j0;

    .line 56
    .line 57
    iget-boolean p1, p1, La/m2j0;->c:Z

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;->setSelected(Z)V

    .line 60
    .line 61
    .line 62
    sget-object p0, La/ezc;->d:La/ezc;

    .line 63
    .line 64
    invoke-virtual {v0, p0}, La/w5j0;->A(La/ezc;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_1
    check-cast p0, La/h2j0;

    .line 69
    .line 70
    check-cast v1, La/cp;

    .line 71
    .line 72
    check-cast v0, La/w5j0;

    .line 73
    .line 74
    iget-object p0, p0, La/h2j0;->b:La/dc3;

    .line 75
    .line 76
    iget-object p0, p0, La/dc3;->d:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;

    .line 79
    .line 80
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, La/m2j0;

    .line 85
    .line 86
    iget-boolean p1, p1, La/m2j0;->b:Z

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;->setSelected(Z)V

    .line 89
    .line 90
    .line 91
    sget-object p0, La/ezc;->c:La/ezc;

    .line 92
    .line 93
    invoke-virtual {v0, p0}, La/w5j0;->A(La/ezc;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_2
    check-cast p0, La/h2j0;

    .line 98
    .line 99
    check-cast v1, La/cp;

    .line 100
    .line 101
    check-cast v0, La/w5j0;

    .line 102
    .line 103
    iget-object p0, p0, La/h2j0;->d:La/dc3;

    .line 104
    .line 105
    iget-object p0, p0, La/dc3;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;

    .line 108
    .line 109
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, La/m2j0;

    .line 114
    .line 115
    iget-boolean p1, p1, La/m2j0;->a:Z

    .line 116
    .line 117
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;->setSelected(Z)V

    .line 118
    .line 119
    .line 120
    sget-object p0, La/ezc;->b:La/ezc;

    .line 121
    .line 122
    invoke-virtual {v0, p0}, La/w5j0;->A(La/ezc;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
