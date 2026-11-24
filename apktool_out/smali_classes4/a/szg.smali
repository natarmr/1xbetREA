.class public final synthetic La/szg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uzg;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/uzg;Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/szg;->a:B

    iput-object p1, p0, La/szg;->b:La/uzg;

    iput-object p2, p0, La/szg;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/szg;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/szg;->b:La/uzg;

    .line 4
    .line 5
    check-cast p1, La/k0w0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, La/uzg;->g:La/nv20;

    .line 14
    .line 15
    iget-object v0, v0, La/nv20;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/h6i;

    .line 18
    .line 19
    invoke-virtual {v0}, La/h6i;->c()La/yox;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object p0, p0, La/szg;->c:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, La/yox;->h(Ljava/lang/String;)Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v3, v1, La/uzg;->b:La/vqc;

    .line 39
    .line 40
    iget-object v4, p0, La/szg;->c:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance v2, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;

    .line 46
    .line 47
    const-wide/16 v5, 0x0

    .line 48
    .line 49
    const/4 v7, 0x0

    .line 50
    invoke-direct/range {v2 .. v7}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;-><init>(La/vqc;Ljava/lang/String;JZ)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
