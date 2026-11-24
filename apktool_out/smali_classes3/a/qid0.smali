.class public final La/qid0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0006"
    }
    d2 = {
        "La/qid0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/oid0",
        "a/rl70",
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
.field public static final V1:La/rl70;

.field public static final synthetic W1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/fiu0;

.field public M1:La/ii;

.field public final N1:La/kiu0;

.field public final O1:La/s0r;

.field public final P1:La/phf0;

.field public final Q1:La/phf0;

.field public final R1:La/n0o0;

.field public final S1:La/n0o0;

.field public final U1:La/ywq;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/qid0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/authqr/impl/databinding/FragmentQrScannerBinding;"

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
    sput-object v1, La/qid0;->W1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/rl70;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/qid0;->V1:La/rl70;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02a8

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/qid0;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/nid0;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, La/nid0;-><init>(La/qid0;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/f1d0;

    .line 18
    .line 19
    const/16 v2, 0xd

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, La/f1d0;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v3, La/f1d0;

    .line 27
    .line 28
    const/16 v4, 0xe

    .line 29
    .line 30
    invoke-direct {v3, v1, v4}, La/f1d0;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-class v2, La/sid0;

    .line 38
    .line 39
    sget-object v3, La/sre0;->a:La/tre0;

    .line 40
    .line 41
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    new-instance v3, La/ync0;

    .line 46
    .line 47
    const/16 v4, 0x10

    .line 48
    .line 49
    invoke-direct {v3, v1, v4}, La/ync0;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    new-instance v4, La/ync0;

    .line 53
    .line 54
    const/16 v5, 0x11

    .line 55
    .line 56
    invoke-direct {v4, v1, v5}, La/ync0;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/qid0;->N1:La/kiu0;

    .line 64
    .line 65
    sget-object v0, La/pid0;->a:La/pid0;

    .line 66
    .line 67
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/qid0;->O1:La/s0r;

    .line 72
    .line 73
    new-instance v0, La/phf0;

    .line 74
    .line 75
    const-string v1, "QR_SCAN_RESULT_REQUEST_KEY"

    .line 76
    .line 77
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, La/qid0;->P1:La/phf0;

    .line 81
    .line 82
    new-instance v0, La/phf0;

    .line 83
    .line 84
    const-string v1, "QR_SCAN_RESULT_BUNDLE_KEY"

    .line 85
    .line 86
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, La/qid0;->Q1:La/phf0;

    .line 90
    .line 91
    new-instance v0, La/nid0;

    .line 92
    .line 93
    const/4 v1, 0x1

    .line 94
    invoke-direct {v0, p0, v1}, La/nid0;-><init>(La/qid0;B)V

    .line 95
    .line 96
    .line 97
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iput-object v0, p0, La/qid0;->R1:La/n0o0;

    .line 102
    .line 103
    new-instance v0, La/nid0;

    .line 104
    .line 105
    const/4 v1, 0x2

    .line 106
    invoke-direct {v0, p0, v1}, La/nid0;-><init>(La/qid0;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput-object v0, p0, La/qid0;->S1:La/n0o0;

    .line 114
    .line 115
    new-instance v0, La/xn;

    .line 116
    .line 117
    const/4 v1, 0x3

    .line 118
    invoke-direct {v0, v1}, La/xn;-><init>(B)V

    .line 119
    .line 120
    .line 121
    new-instance v1, La/yl3;

    .line 122
    .line 123
    const/16 v2, 0xb

    .line 124
    .line 125
    invoke-direct {v1, p0, v2}, La/yl3;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iput-object v0, p0, La/qid0;->U1:La/ywq;

    .line 133
    .line 134
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/qid0;->G0()La/n3r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/n3r;->b:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 6
    .line 7
    new-instance v0, La/nid0;

    .line 8
    .line 9
    const/4 v1, 0x5

    .line 10
    invoke-direct {v0, p0, v1}, La/nid0;-><init>(La/qid0;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/qid0;->G0()La/n3r;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/n3r;->c:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->getViewFinder()Lcom/journeyapps/barcodescanner/ViewfinderView;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Lcom/journeyapps/barcodescanner/ViewfinderView;->setLaserVisibility(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->getStatusView()Landroid/widget/TextView;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/16 v1, 0x8

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->getBarcodeView()Lcom/journeyapps/barcodescanner/BarcodeView;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, La/d2a;->getCameraSettings()La/o2a;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, 0x1

    .line 48
    iput v1, v0, La/o2a;->b:I

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->getBarcodeView()Lcom/journeyapps/barcodescanner/BarcodeView;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, La/d2a;->getCameraSettings()La/o2a;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput v1, v0, La/o2a;->b:I

    .line 59
    .line 60
    new-instance v0, Landroid/content/Intent;

    .line 61
    .line 62
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v1, "QR_CODE"

    .line 66
    .line 67
    const-string v2, "SCAN_FORMATS"

    .line 68
    .line 69
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 70
    .line 71
    .line 72
    const-string v1, "2"

    .line 73
    .line 74
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v0}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->c(Landroid/content/Intent;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, La/qid0;->S1:La/n0o0;

    .line 81
    .line 82
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, La/iu5;

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->a(La/iu5;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const-string v0, "android.permission.CAMERA"

    .line 96
    .line 97
    invoke-static {p1, v0}, La/jiq0;->j0(Landroid/content/Context;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    const/4 v1, -0x1

    .line 102
    if-ne p1, v1, :cond_0

    .line 103
    .line 104
    iget-object p0, p0, La/qid0;->U1:La/ywq;

    .line 105
    .line 106
    invoke-virtual {p0, v0}, La/ywq;->a(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_0
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
    const-class v1, La/rid0;

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
    instance-of v3, v0, La/rid0;

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
    check-cast v2, La/rid0;

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
    iget-object v1, v2, La/rid0;->a:La/ii;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v2, La/yzn0;

    .line 68
    .line 69
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v0, v2, La/yzn0;->a:Ljava/lang/Object;

    .line 73
    .line 74
    new-instance v0, La/ppi;

    .line 75
    .line 76
    const/16 v3, 0xa

    .line 77
    .line 78
    invoke-direct {v0, v2, v3}, La/ppi;-><init>(Ljava/lang/Object;B)V

    .line 79
    .line 80
    .line 81
    iput-object v0, v2, La/yzn0;->b:Ljava/lang/Object;

    .line 82
    .line 83
    new-instance v0, La/fiu0;

    .line 84
    .line 85
    iget-object v2, v2, La/yzn0;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, La/ppi;

    .line 88
    .line 89
    const-class v3, La/sid0;

    .line 90
    .line 91
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-direct {v0, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, La/qid0;->L1:La/fiu0;

    .line 99
    .line 100
    iput-object v1, p0, La/qid0;->M1:La/ii;

    .line 101
    .line 102
    return-void

    .line 103
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 104
    .line 105
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final G0()La/n3r;
    .locals 2

    .line 1
    sget-object v0, La/qid0;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/qid0;->O1:La/s0r;

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
    check-cast p0, La/n3r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, La/nid0;

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    invoke-direct {p1, p0, v0}, La/nid0;-><init>(La/qid0;B)V

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
    new-instance p1, La/nid0;

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    invoke-direct {p1, p0, v1}, La/nid0;-><init>(La/qid0;B)V

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
    invoke-virtual {p0}, La/qid0;->G0()La/n3r;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, La/n3r;->c:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

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
    invoke-virtual {p0}, La/qid0;->G0()La/n3r;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, La/n3r;->c:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->e()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final h0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/qid0;->G0()La/n3r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/n3r;->c:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->getBarcodeView()Lcom/journeyapps/barcodescanner/BarcodeView;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    iput v1, v0, Lcom/journeyapps/barcodescanner/BarcodeView;->B:I

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iput-object v2, v0, Lcom/journeyapps/barcodescanner/BarcodeView;->f1:La/dlj;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/BarcodeView;->j()V

    .line 18
    .line 19
    .line 20
    iput-boolean v1, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 21
    .line 22
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/qid0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
