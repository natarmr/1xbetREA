.class public final La/tu5;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/tu5;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/yk5",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final V1:La/yk5;

.field public static final synthetic W1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/q9i;

.field public M1:La/ii;

.field public final N1:La/kiu0;

.field public final O1:La/s0r;

.field public final P1:La/phf0;

.field public final Q1:La/phf0;

.field public final R1:La/n0o0;

.field public final S1:La/ru5;

.field public final U1:La/ywq;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/tu5;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/barcode_scanner/impl/databinding/FragmentBarcodeScannerBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "requestKey"

    .line 16
    .line 17
    const-string v5, "getRequestKey()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "bundleKey"

    .line 25
    .line 26
    const-string v6, "getBundleKey()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/tu5;->W1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/yk5;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/tu5;->V1:La/yk5;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d01fd

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    const v1, 0x7f040b5d

    .line 10
    .line 11
    .line 12
    sget-object v2, La/bp3;->a:La/bp3;

    .line 13
    .line 14
    invoke-direct {v0, v1, v1, v2, v2}, La/e9o0;-><init>(IILa/bp3;La/bp3;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/tu5;->K1:La/e9o0;

    .line 18
    .line 19
    new-instance v0, La/qu5;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, v1}, La/qu5;-><init>(La/tu5;B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/pp4;

    .line 26
    .line 27
    const/16 v2, 0x1b

    .line 28
    .line 29
    invoke-direct {v1, p0, v2}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    sget-object v2, La/wez;->b:La/wez;

    .line 33
    .line 34
    new-instance v3, La/pp4;

    .line 35
    .line 36
    const/16 v4, 0x1c

    .line 37
    .line 38
    invoke-direct {v3, v1, v4}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-class v2, La/wu5;

    .line 46
    .line 47
    sget-object v3, La/sre0;->a:La/tre0;

    .line 48
    .line 49
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-instance v3, La/qw4;

    .line 54
    .line 55
    const/16 v4, 0x10

    .line 56
    .line 57
    invoke-direct {v3, v1, v4}, La/qw4;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    new-instance v4, La/qw4;

    .line 61
    .line 62
    const/16 v5, 0x11

    .line 63
    .line 64
    invoke-direct {v4, v1, v5}, La/qw4;-><init>(La/a8z;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/tu5;->N1:La/kiu0;

    .line 72
    .line 73
    sget-object v0, La/su5;->a:La/su5;

    .line 74
    .line 75
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, La/tu5;->O1:La/s0r;

    .line 80
    .line 81
    new-instance v0, La/phf0;

    .line 82
    .line 83
    const-string v1, "SCAN_RESULT_REQUEST_KEY"

    .line 84
    .line 85
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, La/tu5;->P1:La/phf0;

    .line 89
    .line 90
    new-instance v0, La/phf0;

    .line 91
    .line 92
    const-string v1, "SCAN_RESULT_BUNDLE_KEY"

    .line 93
    .line 94
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iput-object v0, p0, La/tu5;->Q1:La/phf0;

    .line 98
    .line 99
    new-instance v0, La/qu5;

    .line 100
    .line 101
    const/4 v1, 0x1

    .line 102
    invoke-direct {v0, p0, v1}, La/qu5;-><init>(La/tu5;B)V

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, La/tu5;->R1:La/n0o0;

    .line 110
    .line 111
    new-instance v0, La/ru5;

    .line 112
    .line 113
    invoke-direct {v0, p0}, La/ru5;-><init>(La/tu5;)V

    .line 114
    .line 115
    .line 116
    iput-object v0, p0, La/tu5;->S1:La/ru5;

    .line 117
    .line 118
    new-instance v0, La/xn;

    .line 119
    .line 120
    const/4 v2, 0x3

    .line 121
    invoke-direct {v0, v2}, La/xn;-><init>(B)V

    .line 122
    .line 123
    .line 124
    new-instance v2, La/yl3;

    .line 125
    .line 126
    invoke-direct {v2, p0, v1}, La/yl3;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v2, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iput-object v0, p0, La/tu5;->U1:La/ywq;

    .line 134
    .line 135
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/tu5;->G0()La/iyq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/iyq;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 6
    .line 7
    new-instance v0, La/q10;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-direct {v0, p0, v1}, La/q10;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/tu5;->G0()La/iyq;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p1, La/iyq;->c:Landroid/widget/FrameLayout;

    .line 21
    .line 22
    iget-object v1, p1, La/iyq;->b:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->isLayoutRequested()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {v1}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->getBarcodeView()Lcom/journeyapps/barcodescanner/BarcodeView;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    new-instance v3, La/g7k0;

    .line 49
    .line 50
    invoke-direct {v3, v0, p1}, La/g7k0;-><init>(II)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v3}, La/d2a;->setFramingRectSize(La/g7k0;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    new-instance v2, La/w23;

    .line 58
    .line 59
    const/4 v3, 0x3

    .line 60
    invoke-direct {v2, p1, v3}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-virtual {v1}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->getViewFinder()Lcom/journeyapps/barcodescanner/ViewfinderView;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-virtual {p1, v0}, Lcom/journeyapps/barcodescanner/ViewfinderView;->setLaserVisibility(Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->getStatusView()Landroid/widget/TextView;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const/16 v0, 0x8

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->getBarcodeView()Lcom/journeyapps/barcodescanner/BarcodeView;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, La/d2a;->getCameraSettings()La/o2a;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const/4 v0, 0x1

    .line 92
    iput v0, p1, La/o2a;->b:I

    .line 93
    .line 94
    invoke-virtual {v1}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->getBarcodeView()Lcom/journeyapps/barcodescanner/BarcodeView;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, La/d2a;->getCameraSettings()La/o2a;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iput v0, p1, La/o2a;->b:I

    .line 103
    .line 104
    new-instance p1, Landroid/content/Intent;

    .line 105
    .line 106
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v0, "SCAN_FORMATS"

    .line 110
    .line 111
    const-string v2, "AZTEC,CODABAR,CODE_39,CODE_93,CODE_128,DATA_MATRIX,EAN_8,EAN_13,ITF,MAXICODE,PDF_417,QR_CODE,RSS_14,RSS_EXPANDED,UPC_A,UPC_E,UPC_EAN_EXTENSION"

    .line 112
    .line 113
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p1}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->c(Landroid/content/Intent;)V

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, La/tu5;->S1:La/ru5;

    .line 120
    .line 121
    invoke-virtual {v1, p1}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->a(La/iu5;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    const-string v0, "android.permission.CAMERA"

    .line 129
    .line 130
    invoke-static {p1, v0}, La/jiq0;->j0(Landroid/content/Context;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    const/4 v1, -0x1

    .line 135
    if-ne p1, v1, :cond_1

    .line 136
    .line 137
    iget-object p0, p0, La/tu5;->U1:La/ywq;

    .line 138
    .line 139
    invoke-virtual {p0, v0}, La/ywq;->a(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_1
    return-void
.end method

.method public final C0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/mu5;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/mu5;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/mu5;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v1, v2, La/mu5;->a:La/ii;

    .line 63
    .line 64
    iget-object v2, v2, La/mu5;->b:La/c8c;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance v3, La/es;

    .line 73
    .line 74
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object v0, v3, La/es;->a:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object v2, v3, La/es;->b:Ljava/lang/Object;

    .line 80
    .line 81
    new-instance v0, La/n8i;

    .line 82
    .line 83
    const/16 v2, 0xf

    .line 84
    .line 85
    invoke-direct {v0, v3, v2}, La/n8i;-><init>(Ljava/lang/Object;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, v3, La/es;->c:Ljava/lang/Object;

    .line 93
    .line 94
    iget-object v0, v3, La/es;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, La/n5d0;

    .line 97
    .line 98
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, La/q9i;

    .line 103
    .line 104
    iput-object v0, p0, La/tu5;->L1:La/q9i;

    .line 105
    .line 106
    iput-object v1, p0, La/tu5;->M1:La/ii;

    .line 107
    .line 108
    return-void

    .line 109
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 110
    .line 111
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/tu5;->H0()La/wu5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/wu5;->e:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/lr;

    .line 8
    .line 9
    const/16 v2, 0x18

    .line 10
    .line 11
    invoke-direct {v1, v0, v2}, La/lr;-><init>(La/gmq;B)V

    .line 12
    .line 13
    .line 14
    new-instance v0, La/cm3;

    .line 15
    .line 16
    const/16 v2, 0x13

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v0, p0, v3, v2}, La/cm3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 20
    .line 21
    .line 22
    sget-object v2, La/lkz;->a:La/lkz;

    .line 23
    .line 24
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v4, La/me5;

    .line 37
    .line 38
    invoke-direct {v4, v1, p0, v0, v3}, La/me5;-><init>(La/lr;La/clz;La/cm3;La/yje;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x3

    .line 42
    invoke-static {v2, v3, v3, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final G0()La/iyq;
    .locals 2

    .line 1
    sget-object v0, La/tu5;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/tu5;->O1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/iyq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/wu5;
    .locals 0

    .line 1
    iget-object p0, p0, La/tu5;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/wu5;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, La/qu5;

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-direct {p1, p0, v0}, La/qu5;-><init>(La/tu5;B)V

    .line 8
    .line 9
    .line 10
    const-string v0, "REQUEST_CAMERA_PERMISSION_DIALOG_KEY"

    .line 11
    .line 12
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, La/qu5;

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    invoke-direct {p1, p0, v1}, La/qu5;-><init>(La/tu5;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final d0()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "android.permission.CAMERA"

    .line 9
    .line 10
    invoke-static {v0, v1}, La/jiq0;->j0(Landroid/content/Context;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, La/tu5;->G0()La/iyq;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, La/iyq;->b:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->d()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final e0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "android.permission.CAMERA"

    .line 9
    .line 10
    invoke-static {v0, v1}, La/jiq0;->j0(Landroid/content/Context;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, La/tu5;->G0()La/iyq;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, La/iyq;->b:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->e()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {p0}, La/tu5;->H0()La/wu5;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, La/wu5;->x()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/tu5;->G0()La/iyq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/iyq;->b:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->getBarcodeView()Lcom/journeyapps/barcodescanner/BarcodeView;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iput v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->B:I

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->f1:La/dlj;

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/BarcodeView;->j()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/tu5;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
