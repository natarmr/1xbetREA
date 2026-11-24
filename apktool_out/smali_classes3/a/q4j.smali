.class public final La/q4j;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:La/cr;

.field public final synthetic j:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:I

.field public final synthetic m:Lkotlin/jvm/functions/Function0;

.field public final synthetic n:La/bmh;

.field public final synthetic o:La/hie0;

.field public final synthetic p:La/vne;


# direct methods
.method public constructor <init>(La/cr;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;Ljava/lang/String;ILkotlin/jvm/functions/Function0;La/bmh;La/hie0;La/vne;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/q4j;->i:La/cr;

    .line 2
    .line 3
    iput-object p2, p0, La/q4j;->j:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 4
    .line 5
    iput-object p3, p0, La/q4j;->k:Ljava/lang/String;

    .line 6
    .line 7
    iput p4, p0, La/q4j;->l:I

    .line 8
    .line 9
    iput-object p5, p0, La/q4j;->m:Lkotlin/jvm/functions/Function0;

    .line 10
    .line 11
    iput-object p6, p0, La/q4j;->n:La/bmh;

    .line 12
    .line 13
    iput-object p7, p0, La/q4j;->o:La/hie0;

    .line 14
    .line 15
    iput-object p8, p0, La/q4j;->p:La/vne;

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1, p9}, La/bnn0;-><init>(ILa/yje;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    new-instance v0, La/q4j;

    .line 2
    .line 3
    iget-object v7, p0, La/q4j;->o:La/hie0;

    .line 4
    .line 5
    iget-object v8, p0, La/q4j;->p:La/vne;

    .line 6
    .line 7
    iget-object v1, p0, La/q4j;->i:La/cr;

    .line 8
    .line 9
    iget-object v2, p0, La/q4j;->j:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 10
    .line 11
    iget-object v3, p0, La/q4j;->k:Ljava/lang/String;

    .line 12
    .line 13
    iget v4, p0, La/q4j;->l:I

    .line 14
    .line 15
    iget-object v5, p0, La/q4j;->m:Lkotlin/jvm/functions/Function0;

    .line 16
    .line 17
    iget-object v6, p0, La/q4j;->n:La/bmh;

    .line 18
    .line 19
    move-object v9, p2

    .line 20
    invoke-direct/range {v0 .. v9}, La/q4j;-><init>(La/cr;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;Ljava/lang/String;ILkotlin/jvm/functions/Function0;La/bmh;La/hie0;La/vne;La/yje;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/q4j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/q4j;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/q4j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, La/q4j;->i:La/cr;

    .line 7
    .line 8
    iget-object v0, p1, La/cr;->j:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v1, v0

    .line 11
    check-cast v1, La/wdk0;

    .line 12
    .line 13
    new-instance v2, La/xdk0;

    .line 14
    .line 15
    sget-object v3, La/pek0;->a:La/pek0;

    .line 16
    .line 17
    new-instance v6, La/hdk0;

    .line 18
    .line 19
    iget-object p1, p1, La/cr;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, La/us00;

    .line 22
    .line 23
    iget v0, p0, La/q4j;->l:I

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, La/q4j;->m:Lkotlin/jvm/functions/Function0;

    .line 33
    .line 34
    invoke-direct {v6, p1, v0}, La/hdk0;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 35
    .line 36
    .line 37
    sget-object v7, La/jtv;->x:La/jtv;

    .line 38
    .line 39
    const/4 v8, 0x0

    .line 40
    const/16 v9, 0x64

    .line 41
    .line 42
    iget-object v4, p0, La/q4j;->k:Ljava/lang/String;

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 46
    .line 47
    .line 48
    const/16 v9, 0x74

    .line 49
    .line 50
    iget-object v3, p0, La/q4j;->j:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    iget-object v5, p0, La/q4j;->n:La/bmh;

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x0

    .line 57
    invoke-static/range {v1 .. v9}, La/wdk0;->j(La/wdk0;La/xdk0;La/kxq;Landroid/view/View;Lkotlin/jvm/functions/Function0;ZZLjava/lang/Integer;I)La/ndk0;

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, La/q4j;->o:La/hie0;

    .line 61
    .line 62
    const/4 v0, 0x1

    .line 63
    iput-boolean v0, p1, La/hie0;->a:Z

    .line 64
    .line 65
    iget-object p0, p0, La/q4j;->p:La/vne;

    .line 66
    .line 67
    const/4 p1, 0x0

    .line 68
    invoke-static {p0, p1}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0
.end method
