.class public final synthetic La/szd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uzd;


# direct methods
.method public synthetic constructor <init>(La/uzd;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/szd;->a:B

    iput-object p1, p0, La/szd;->b:La/uzd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/szd;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/szd;->b:La/uzd;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/iqt0;

    .line 9
    .line 10
    sget-object v0, La/uzd;->S1:La/qud;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/uzd;->J0()La/g1e;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, La/g1e;->i:La/z4w0;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/z4w0;->a(La/iqt0;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 28
    .line 29
    sget-object v0, La/uzd;->S1:La/qud;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/uzd;->G0()La/ii;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v0, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 39
    .line 40
    const v1, 0x7f1304e4

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const v2, 0x7f1304e7

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const v3, 0x7f1304e8

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    const v4, 0x7f13032f

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    sget-object v9, La/n12;->a:La/n12;

    .line 72
    .line 73
    const/4 v10, 0x0

    .line 74
    const/16 v11, 0x5d0

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    const-string v6, "REQUEST_CONSULTANT_KEY"

    .line 78
    .line 79
    const/4 v7, 0x0

    .line 80
    const/4 v8, 0x0

    .line 81
    invoke-direct/range {v0 .. v11}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v0, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_1
    check-cast p1, Landroid/text/Editable;

    .line 98
    .line 99
    sget-object v0, La/uzd;->S1:La/qud;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, La/uzd;->J0()La/g1e;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const-string v0, ""

    .line 113
    .line 114
    if-nez p1, :cond_0

    .line 115
    .line 116
    move-object p1, v0

    .line 117
    :cond_0
    iput-object p1, p0, La/g1e;->A:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {p0, v0}, La/g1e;->E(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, La/g1e;->B:La/p7m0;

    .line 123
    .line 124
    invoke-virtual {p0, p1}, La/g1e;->I(La/qz40;)V

    .line 125
    .line 126
    .line 127
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p0

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
