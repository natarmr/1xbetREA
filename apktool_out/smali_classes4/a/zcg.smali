.class public final La/zcg;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/aer;


# instance fields
.field public synthetic i:Ljava/lang/String;

.field public synthetic j:Z

.field public synthetic k:Z

.field public synthetic l:La/hhq0;

.field public synthetic m:Ljava/util/List;

.field public final synthetic n:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/zcg;->n:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 2
    .line 3
    const/4 p1, 0x6

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v3, p0, La/zcg;->i:Ljava/lang/String;

    .line 2
    .line 3
    iget-boolean v4, p0, La/zcg;->j:Z

    .line 4
    .line 5
    iget-boolean v5, p0, La/zcg;->k:Z

    .line 6
    .line 7
    iget-object v6, p0, La/zcg;->l:La/hhq0;

    .line 8
    .line 9
    iget-object v0, p0, La/zcg;->m:Ljava/util/List;

    .line 10
    .line 11
    sget-object v1, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    move-object p1, v0

    .line 17
    new-instance v0, La/whg;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    :goto_0
    move v7, p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    goto :goto_0

    .line 32
    :goto_1
    const/16 v8, 0x80

    .line 33
    .line 34
    iget-object v1, p0, La/zcg;->n:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 35
    .line 36
    sget-object v2, La/bnb;->a:La/bnb;

    .line 37
    .line 38
    invoke-direct/range {v0 .. v8}, La/whg;-><init>(Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;La/cnb;Ljava/lang/String;ZZLa/hhq0;ZI)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    check-cast p4, La/hhq0;

    .line 16
    .line 17
    check-cast p5, Ljava/util/List;

    .line 18
    .line 19
    check-cast p6, La/yje;

    .line 20
    .line 21
    new-instance v0, La/zcg;

    .line 22
    .line 23
    iget-object p0, p0, La/zcg;->n:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 24
    .line 25
    invoke-direct {v0, p0, p6}, La/zcg;-><init>(Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;La/yje;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, v0, La/zcg;->i:Ljava/lang/String;

    .line 29
    .line 30
    iput-boolean p2, v0, La/zcg;->j:Z

    .line 31
    .line 32
    iput-boolean p3, v0, La/zcg;->k:Z

    .line 33
    .line 34
    iput-object p4, v0, La/zcg;->l:La/hhq0;

    .line 35
    .line 36
    iput-object p5, v0, La/zcg;->m:Ljava/util/List;

    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, La/zcg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method
