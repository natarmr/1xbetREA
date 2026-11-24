.class public La/kys0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/lix0;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;
.implements La/jgd;
.implements La/xmw0;


# static fields
.field public static final synthetic b:La/kys0;

.field public static final synthetic c:La/kys0;

.field public static final synthetic d:La/kys0;

.field public static final synthetic e:La/kys0;

.field public static final synthetic f:La/kys0;

.field public static final synthetic g:La/kys0;


# instance fields
.field public final synthetic a:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/kys0;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/kys0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/kys0;->b:La/kys0;

    .line 9
    .line 10
    new-instance v0, La/kys0;

    .line 11
    .line 12
    const/16 v1, 0x18

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/kys0;-><init>(B)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/kys0;->c:La/kys0;

    .line 18
    .line 19
    new-instance v0, La/kys0;

    .line 20
    .line 21
    const/16 v1, 0x19

    .line 22
    .line 23
    invoke-direct {v0, v1}, La/kys0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/kys0;->d:La/kys0;

    .line 27
    .line 28
    new-instance v0, La/kys0;

    .line 29
    .line 30
    const/16 v1, 0x1b

    .line 31
    .line 32
    invoke-direct {v0, v1}, La/kys0;-><init>(B)V

    .line 33
    .line 34
    .line 35
    sput-object v0, La/kys0;->e:La/kys0;

    .line 36
    .line 37
    new-instance v0, La/kys0;

    .line 38
    .line 39
    const/16 v1, 0x1c

    .line 40
    .line 41
    invoke-direct {v0, v1}, La/kys0;-><init>(B)V

    .line 42
    .line 43
    .line 44
    sput-object v0, La/kys0;->f:La/kys0;

    .line 45
    .line 46
    new-instance v0, La/kys0;

    .line 47
    .line 48
    const/16 v1, 0x1d

    .line 49
    .line 50
    invoke-direct {v0, v1}, La/kys0;-><init>(B)V

    .line 51
    .line 52
    .line 53
    sput-object v0, La/kys0;->g:La/kys0;

    .line 54
    .line 55
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/kys0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/kys0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(I)La/nev0;
    .locals 5

    .line 1
    invoke-static {}, La/nev0;->values()[La/nev0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    iget-byte v4, v3, La/nev0;->a:B

    .line 12
    .line 13
    if-ne v4, p0, :cond_0

    .line 14
    .line 15
    return-object v3

    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/lc00;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x4

    .line 19
    if-ge v1, v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    sget-object p0, La/kh4;->a:La/kh4;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-ge p0, v2, :cond_1

    .line 38
    .line 39
    sget-object p0, La/ih4;->a:La/ih4;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-nez p0, :cond_2

    .line 50
    .line 51
    sget-object p0, La/jh4;->a:La/jh4;

    .line 52
    .line 53
    invoke-virtual {v0, p0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-nez p0, :cond_3

    .line 61
    .line 62
    sget-object p0, La/hh4;->a:La/hh4;

    .line 63
    .line 64
    invoke-virtual {v0, p0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method

.method public static final h(Ljava/lang/Object;Ljava/lang/Object;)La/ifw0;
    .locals 1

    .line 1
    check-cast p0, La/ifw0;

    .line 2
    .line 3
    check-cast p1, La/ifw0;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, La/ifw0;->a:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, La/ifw0;->a()La/ifw0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_0
    invoke-virtual {p0}, La/ifw0;->d()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, p1}, La/ifw0;->putAll(Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-object p0
.end method


# virtual methods
.method public a(La/iys0;Ljava/util/List;)La/vzs0;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, La/iys0;->getParameters()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/hzs0;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, La/hzs0;->H()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-ne v0, v1, :cond_1

    .line 28
    .line 29
    invoke-interface {p1}, La/iys0;->getParameters()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance p1, Ljava/util/ArrayList;

    .line 37
    .line 38
    const/16 v0, 0xa

    .line 39
    .line 40
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, La/hzs0;

    .line 62
    .line 63
    invoke-interface {v0}, La/hzs0;->h()La/iys0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->T0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, La/xp20;->m(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance p1, La/r4m0;

    .line 83
    .line 84
    invoke-direct {p1, p0, v1}, La/r4m0;-><init>(Ljava/lang/Object;B)V

    .line 85
    .line 86
    .line 87
    return-object p1

    .line 88
    :cond_1
    new-instance p1, La/g5x;

    .line 89
    .line 90
    const/4 v0, 0x0

    .line 91
    new-array v1, v0, [La/hzs0;

    .line 92
    .line 93
    invoke-interface {p0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, [La/hzs0;

    .line 98
    .line 99
    new-array v1, v0, [La/pzs0;

    .line 100
    .line 101
    invoke-interface {p2, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    check-cast p2, [La/pzs0;

    .line 106
    .line 107
    invoke-direct {p1, p0, p2, v0}, La/g5x;-><init>([La/hzs0;[La/pzs0;Z)V

    .line 108
    .line 109
    .line 110
    return-object p1
.end method

.method public synthetic b(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-static {p1, p2}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public d(JLjava/lang/String;)Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;

    .line 5
    .line 6
    invoke-direct {p0, p1, p2, p3}, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;-><init>(JLjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public e(JJLjava/lang/String;)Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;

    .line 5
    .line 6
    invoke-direct/range {p0 .. p5}, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;-><init>(JJLjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public g(Ljava/lang/CharSequence;)Z
    .locals 0

    .line 1
    instance-of p0, p1, La/csb0;

    .line 2
    .line 3
    return p0
.end method

.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    .line 1
    check-cast p1, Landroid/os/Bundle;

    .line 2
    .line 3
    sget p0, La/cig0;->h:I

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const-string p0, "google.messenger"

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-byte v0, p0, La/kys0;->a:B

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
    const-class v0, Ljava/lang/String;

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
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic x0(La/pzu;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;->zza(La/dgd;)La/vp2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public zza()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte p0, p0, La/kys0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    sget-object p0, La/btw0;->a:Ljava/util/List;

    .line 7
    .line 8
    sget-object p0, La/zgw0;->b:La/zgw0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/zgw0;->a()La/ahw0;

    .line 11
    .line 12
    .line 13
    sget-object p0, La/ahw0;->a:La/trm0;

    .line 14
    .line 15
    const/16 v0, 0x2f

    .line 16
    .line 17
    const-wide/16 v1, 0x1388

    .line 18
    .line 19
    const-string v3, "measurement.sgtm.upload.max_queued_batches"

    .line 20
    .line 21
    invoke-virtual {p0, v3, v0, v1, v2}, La/trm0;->u(Ljava/lang/String;IJ)La/b5x0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, La/b5x0;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/lang/Long;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    long-to-int p0, v0

    .line 36
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_1
    sget-object p0, La/btw0;->a:Ljava/util/List;

    .line 42
    .line 43
    sget-object p0, La/zgw0;->b:La/zgw0;

    .line 44
    .line 45
    invoke-virtual {p0}, La/zgw0;->a()La/ahw0;

    .line 46
    .line 47
    .line 48
    sget-object p0, La/ahw0;->a:La/trm0;

    .line 49
    .line 50
    const/16 v0, 0x1d

    .line 51
    .line 52
    const-wide/32 v1, 0x5265c00

    .line 53
    .line 54
    .line 55
    const-string v3, "measurement.monitoring.sample_period_millis"

    .line 56
    .line 57
    invoke-virtual {p0, v3, v0, v1, v2}, La/trm0;->u(Ljava/lang/String;IJ)La/b5x0;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, La/b5x0;->get()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Ljava/lang/Long;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_2
    sget-object p0, La/btw0;->a:Ljava/util/List;

    .line 69
    .line 70
    sget-object p0, La/zgw0;->b:La/zgw0;

    .line 71
    .line 72
    invoke-virtual {p0}, La/zgw0;->a()La/ahw0;

    .line 73
    .line 74
    .line 75
    sget-object p0, La/ahw0;->a:La/trm0;

    .line 76
    .line 77
    const/16 v0, 0x14

    .line 78
    .line 79
    const-wide/32 v1, 0x186a0

    .line 80
    .line 81
    .line 82
    const-string v3, "measurement.store.max_stored_events_per_app"

    .line 83
    .line 84
    invoke-virtual {p0, v3, v0, v1, v2}, La/trm0;->u(Ljava/lang/String;IJ)La/b5x0;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p0}, La/b5x0;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, Ljava/lang/Long;

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    long-to-int p0, v0

    .line 99
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :pswitch_3
    sget-object p0, La/xhw0;->b:La/xhw0;

    .line 105
    .line 106
    iget-object p0, p0, La/xhw0;->a:La/oin0;

    .line 107
    .line 108
    iget-object p0, p0, La/oin0;->a:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p0, La/zhw0;

    .line 111
    .line 112
    sget-object p0, La/zhw0;->a:La/n4x0;

    .line 113
    .line 114
    invoke-virtual {p0}, La/b5x0;->get()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    new-instance v0, Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-direct {v0, p0}, Ljava/lang/Boolean;-><init>(Z)V

    .line 127
    .line 128
    .line 129
    return-object v0

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
