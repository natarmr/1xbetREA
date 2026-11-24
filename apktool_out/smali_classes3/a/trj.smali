.class public final synthetic La/trj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zrj;

.field public final synthetic c:Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;


# direct methods
.method public synthetic constructor <init>(La/zrj;Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/trj;->a:B

    iput-object p1, p0, La/trj;->b:La/zrj;

    iput-object p2, p0, La/trj;->c:Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/trj;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/trj;->c:Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;

    .line 5
    .line 6
    iget-object p0, p0, La/trj;->b:La/zrj;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/k0w0;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/zrj;->k:La/vqc;

    .line 17
    .line 18
    new-instance v0, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 19
    .line 20
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 21
    .line 22
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromSection;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromSection;

    .line 23
    .line 24
    invoke-direct {v0, v3, v4}, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;-><init>(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;)V

    .line 25
    .line 26
    .line 27
    new-instance v3, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$homeScreen$1;

    .line 28
    .line 29
    invoke-direct {v3, p0, v0}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$homeScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/home/CyberHomeParams;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x2

    .line 33
    new-array p0, p0, [La/m7h0;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    aput-object v3, p0, v0

    .line 37
    .line 38
    aput-object v2, p0, v1

    .line 39
    .line 40
    invoke-virtual {p1, p0}, La/k0w0;->i([La/m7h0;)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    check-cast p1, La/i1w0;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v0, La/trj;

    .line 52
    .line 53
    invoke-direct {v0, p0, v2, v1}, La/trj;-><init>(La/zrj;Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;B)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
