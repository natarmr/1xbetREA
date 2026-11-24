.class public final synthetic La/s0c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s1c;

.field public final synthetic c:La/owf0;

.field public final synthetic d:Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;


# direct methods
.method public synthetic constructor <init>(La/s1c;La/owf0;Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/s0c;->a:B

    iput-object p1, p0, La/s0c;->b:La/s1c;

    iput-object p2, p0, La/s0c;->c:La/owf0;

    iput-object p3, p0, La/s0c;->d:Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/s0c;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/s0c;->d:Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;

    .line 4
    .line 5
    iget-object v2, p0, La/s0c;->c:La/owf0;

    .line 6
    .line 7
    iget-object p0, p0, La/s0c;->b:La/s1c;

    .line 8
    .line 9
    check-cast p1, La/k0w0;

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
    iget-object p0, p0, La/s1c;->p:La/zn00;

    .line 18
    .line 19
    new-instance v0, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;

    .line 20
    .line 21
    check-cast v2, La/mwf0;

    .line 22
    .line 23
    iget-object v2, v2, La/mwf0;->b:La/swp0;

    .line 24
    .line 25
    iget-object v3, v2, La/swp0;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v2, v2, La/swp0;->a:Ljava/lang/String;

    .line 28
    .line 29
    sget-object v4, La/tzf0;->b:La/tzf0;

    .line 30
    .line 31
    invoke-direct {v0, v3, v2, v4}, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;-><init>(Ljava/lang/String;Ljava/lang/String;La/tzf0;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v1, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;->b:La/we50;

    .line 35
    .line 36
    invoke-virtual {p0, v0, v1}, La/zn00;->x0(Lorg/xplatform/security/api/presentation/models/TokenRestoreData;La/we50;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p1, p0}, La/k0w0;->k(La/m7h0;)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, La/s1c;->p:La/zn00;

    .line 50
    .line 51
    new-instance v0, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;

    .line 52
    .line 53
    check-cast v2, La/lwf0;

    .line 54
    .line 55
    iget-object v3, v2, La/lwf0;->b:La/swp0;

    .line 56
    .line 57
    iget-object v4, v3, La/swp0;->b:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, v3, La/swp0;->a:Ljava/lang/String;

    .line 60
    .line 61
    sget-object v5, La/tzf0;->b:La/tzf0;

    .line 62
    .line 63
    invoke-direct {v0, v4, v3, v5}, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;-><init>(Ljava/lang/String;Ljava/lang/String;La/tzf0;)V

    .line 64
    .line 65
    .line 66
    iget-object v2, v2, La/lwf0;->a:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->M0(Ljava/util/Collection;)[J

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget-object v1, v1, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;->b:La/we50;

    .line 73
    .line 74
    invoke-virtual {p0, v0, v2, v1}, La/zn00;->E0(Lorg/xplatform/security/api/presentation/models/TokenRestoreData;[JLa/we50;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p1, p0}, La/k0w0;->k(La/m7h0;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object p0, p0, La/s1c;->p:La/zn00;

    .line 88
    .line 89
    new-instance v0, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;

    .line 90
    .line 91
    check-cast v2, La/nwf0;

    .line 92
    .line 93
    iget-object v2, v2, La/nwf0;->a:La/swp0;

    .line 94
    .line 95
    iget-object v3, v2, La/swp0;->b:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v2, v2, La/swp0;->a:Ljava/lang/String;

    .line 98
    .line 99
    sget-object v4, La/tzf0;->b:La/tzf0;

    .line 100
    .line 101
    invoke-direct {v0, v3, v2, v4}, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;-><init>(Ljava/lang/String;Ljava/lang/String;La/tzf0;)V

    .line 102
    .line 103
    .line 104
    iget-object v1, v1, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;->b:La/we50;

    .line 105
    .line 106
    const-wide/16 v2, -0x1

    .line 107
    .line 108
    invoke-virtual {p0, v0, v2, v3, v1}, La/zn00;->J0(Lorg/xplatform/security/api/presentation/models/TokenRestoreData;JLa/we50;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 113
    .line 114
    .line 115
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object p0

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
