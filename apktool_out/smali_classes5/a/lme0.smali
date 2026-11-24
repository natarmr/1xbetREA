.class public final La/lme0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/lah0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 13
    iput-byte p1, p0, La/lme0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/gl5;La/gle0;)V
    .locals 0

    const/16 p1, 0x19

    iput-byte p1, p0, La/lme0;->a:B

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/r9u;)V
    .locals 1

    .line 1
    const/16 v0, 0x1c

    .line 2
    .line 3
    iput-byte v0, p0, La/lme0;->a:B

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static a(Lorg/xplatform/registration/success/api/RegistrationSuccessParams;)Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;
    .locals 3

    .line 1
    sget-object v0, La/m6f0;->f2:La/gle0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/m6f0;->h2:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v1, La/ex60;

    .line 9
    .line 10
    const/16 v2, 0x13

    .line 11
    .line 12
    invoke-direct {v1, p0, v2}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    new-instance p0, Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;

    .line 16
    .line 17
    invoke-direct {p0, v0, v1}, Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;-><init>(Ljava/lang/String;La/xbf;)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public static b(Landroidx/fragment/app/e;Ljava/lang/String;Ljava/util/List;Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, La/jlk0;->p2:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    new-instance v1, La/jlk0;

    .line 19
    .line 20
    invoke-direct {v1}, La/jlk0;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v2, La/jlk0;->o2:[La/iiy;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    aget-object v3, v2, v3

    .line 27
    .line 28
    iget-object v4, v1, La/jlk0;->k2:La/phf0;

    .line 29
    .line 30
    invoke-virtual {v4, v1, v3, p1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    aget-object p1, v2, p1

    .line 35
    .line 36
    iget-object v3, v1, La/jlk0;->l2:La/lhf0;

    .line 37
    .line 38
    invoke-virtual {v3, v1, p1, p2}, La/lhf0;->I(Landroidx/fragment/app/Fragment;La/iiy;Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x2

    .line 42
    aget-object p1, v2, p1

    .line 43
    .line 44
    iget-object p2, v1, La/jlk0;->m2:La/khf0;

    .line 45
    .line 46
    invoke-virtual {p2, v1, p1, p3}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p0, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public static c(Landroidx/fragment/app/e;Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;->b:Ljava/lang/String;

    .line 5
    .line 6
    const-string v1, "SelectDateTimeBottomSheetDialog"

    .line 7
    .line 8
    invoke-static {v1, v0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    new-instance v1, La/y3i0;

    .line 19
    .line 20
    invoke-direct {v1}, La/y3i0;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v2, La/y3i0;->o2:[La/iiy;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    aget-object v2, v2, v3

    .line 27
    .line 28
    iget-object v3, v1, La/y3i0;->k2:La/khf0;

    .line 29
    .line 30
    invoke-virtual {v3, v1, v2, p1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p0, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method


# virtual methods
.method public onScrollLimit(IIIZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public onScrollProgress(IIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-byte v0, p0, La/lme0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/16 v0, 0x10

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/text/CharsKt;->checkRadix(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const-class v0, La/i0h0;

    .line 29
    .line 30
    sget-object v1, La/sre0;->a:La/tre0;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, La/sgy;->J()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "<"

    .line 41
    .line 42
    const-string v2, ">"

    .line 43
    .line 44
    const-string v3, "CreationExtras.Key@"

    .line 45
    .line 46
    invoke-static {v3, p0, v1, v0, v2}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method
