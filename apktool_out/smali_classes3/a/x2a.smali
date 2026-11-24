.class public final La/x2a;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:La/mie0;

.field public final synthetic j:La/mie0;

.field public final synthetic k:La/tw2;


# direct methods
.method public constructor <init>(La/mie0;La/mie0;La/tw2;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/x2a;->i:La/mie0;

    .line 2
    .line 3
    iput-object p2, p0, La/x2a;->j:La/mie0;

    .line 4
    .line 5
    iput-object p3, p0, La/x2a;->k:La/tw2;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 3

    .line 1
    new-instance v0, La/x2a;

    .line 2
    .line 3
    iget-object v1, p0, La/x2a;->j:La/mie0;

    .line 4
    .line 5
    iget-object v2, p0, La/x2a;->k:La/tw2;

    .line 6
    .line 7
    iget-object p0, p0, La/x2a;->i:La/mie0;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2, p1}, La/x2a;-><init>(La/mie0;La/mie0;La/tw2;La/yje;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/x2a;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/x2a;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/x2a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "tryOpenCamera: 3000ms elapsed"

    .line 7
    .line 8
    const-string v0, "CXCP"

    .line 9
    .line 10
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, La/x2a;->i:La/mie0;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iput-object v1, p1, La/mie0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p1, p0, La/x2a;->j:La/mie0;

    .line 19
    .line 20
    iget-object p1, p1, La/mie0;->a:Ljava/lang/Object;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const-string p1, "tryOpenCamera: openCamera() timed out"

    .line 25
    .line 26
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/x2a;->k:La/tw2;

    .line 30
    .line 31
    invoke-virtual {p0}, La/tw2;->a()V

    .line 32
    .line 33
    .line 34
    new-instance p0, La/hw70;

    .line 35
    .line 36
    new-instance p1, La/az9;

    .line 37
    .line 38
    const/16 v0, 0xd

    .line 39
    .line 40
    invoke-direct {p1, v0}, La/az9;-><init>(I)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-direct {p0, v1, p1, v0}, La/hw70;-><init>(La/tw2;La/az9;I)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_0
    return-object v1
.end method
