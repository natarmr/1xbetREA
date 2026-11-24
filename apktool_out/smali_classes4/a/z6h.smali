.class public final La/z6h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/fragment/app/Fragment;

.field public final b:La/e720;

.field public final c:La/vq;

.field public final d:La/ii;

.field public final e:La/ouu;

.field public final f:La/v88;

.field public final g:La/wdk0;

.field public final h:La/lgn0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;La/e720;La/vq;La/wsz;La/ii;La/ouu;La/v88;La/wdk0;La/lgn0;)V
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/z6h;->a:Landroidx/fragment/app/Fragment;

    .line 11
    .line 12
    iput-object p2, p0, La/z6h;->b:La/e720;

    .line 13
    .line 14
    iput-object p3, p0, La/z6h;->c:La/vq;

    .line 15
    .line 16
    iput-object p5, p0, La/z6h;->d:La/ii;

    .line 17
    .line 18
    iput-object p6, p0, La/z6h;->e:La/ouu;

    .line 19
    .line 20
    iput-object p7, p0, La/z6h;->f:La/v88;

    .line 21
    .line 22
    iput-object p8, p0, La/z6h;->g:La/wdk0;

    .line 23
    .line 24
    iput-object p9, p0, La/z6h;->h:La/lgn0;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function1;)V
    .locals 4

    .line 1
    new-instance v0, La/lq2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/gn;

    .line 7
    .line 8
    const/16 v2, 0x10

    .line 9
    .line 10
    invoke-direct {v1, p1, v2}, La/gn;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, La/z6h;->c:La/vq;

    .line 14
    .line 15
    iget-object p0, p0, La/z6h;->a:Landroidx/fragment/app/Fragment;

    .line 16
    .line 17
    invoke-virtual {v2, p0, v0, v1}, La/vq;->e(Landroidx/fragment/app/Fragment;La/ms2;La/xdr;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, La/lq2;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/afd;

    .line 26
    .line 27
    const/16 v3, 0x14

    .line 28
    .line 29
    invoke-direct {v1, p1, v3}, La/afd;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, p0, v0, v1}, La/vq;->f(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function0;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, La/afd;

    .line 36
    .line 37
    const/16 v1, 0x15

    .line 38
    .line 39
    invoke-direct {v0, p1, v1}, La/afd;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 40
    .line 41
    .line 42
    const-string v1, "REQUEST_CODE_SHOW_COUPON_HAS_SAME_EVENT_BS"

    .line 43
    .line 44
    invoke-static {p0, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, La/afd;

    .line 48
    .line 49
    const/16 v1, 0x16

    .line 50
    .line 51
    invoke-direct {v0, p1, v1}, La/afd;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 52
    .line 53
    .line 54
    const-string v1, "REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG_BS"

    .line 55
    .line 56
    invoke-static {p0, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 57
    .line 58
    .line 59
    new-instance v0, La/afd;

    .line 60
    .line 61
    const/16 v1, 0x17

    .line 62
    .line 63
    invoke-direct {v0, p1, v1}, La/afd;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 64
    .line 65
    .line 66
    const-string v1, "REQUEST_CODE_BET_EXIST_ERROR_BS"

    .line 67
    .line 68
    invoke-static {p0, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 69
    .line 70
    .line 71
    new-instance v0, La/afd;

    .line 72
    .line 73
    const/16 v1, 0x18

    .line 74
    .line 75
    invoke-direct {v0, p1, v1}, La/afd;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 76
    .line 77
    .line 78
    const-string p1, "REQUEST_CODE_NOT_ENOUGH_MONEY_ERROR_BS"

    .line 79
    .line 80
    invoke-static {p0, p1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 1
    new-instance v0, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2
    .line 3
    const v1, 0x7f130e5c

    .line 4
    .line 5
    .line 6
    iget-object v12, p0, La/z6h;->a:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v9, La/n12;->b:La/n12;

    .line 16
    .line 17
    const/4 v10, 0x0

    .line 18
    const/16 v11, 0x5f8

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    move-object v1, p1

    .line 26
    move-object v2, p2

    .line 27
    invoke-direct/range {v0 .. v11}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, La/z6h;->d:La/ii;

    .line 31
    .line 32
    invoke-static {v12, p0, v0}, La/ua80;->r(Landroidx/fragment/app/Fragment;La/ii;Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v0, La/xdk0;

    .line 2
    .line 3
    sget-object v1, La/rek0;->b:La/rek0;

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const/16 v7, 0x7c

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    move-object v2, p1

    .line 12
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 13
    .line 14
    .line 15
    const/16 v7, 0x3fc

    .line 16
    .line 17
    move-object v1, v0

    .line 18
    iget-object v0, p0, La/z6h;->g:La/wdk0;

    .line 19
    .line 20
    iget-object v2, p0, La/z6h;->a:Landroidx/fragment/app/Fragment;

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-static/range {v0 .. v7}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 24
    .line 25
    .line 26
    return-void
.end method
