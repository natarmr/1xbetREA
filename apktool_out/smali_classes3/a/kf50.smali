.class public final synthetic La/kf50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m7h0;

.field public final synthetic c:Z

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(La/m7h0;ZZB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/kf50;->a:B

    iput-object p1, p0, La/kf50;->b:La/m7h0;

    iput-boolean p2, p0, La/kf50;->c:Z

    iput-boolean p3, p0, La/kf50;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/kf50;->a:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/kf50;->d:Z

    .line 4
    .line 5
    iget-boolean v2, p0, La/kf50;->c:Z

    .line 6
    .line 7
    iget-object p0, p0, La/kf50;->b:La/m7h0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/k0w0;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, La/c8d;

    .line 24
    .line 25
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 26
    .line 27
    new-instance v0, La/bjk;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    invoke-direct {v0, v4, v3, v3, v1}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 32
    .line 33
    .line 34
    new-instance v1, La/v7d;

    .line 35
    .line 36
    invoke-direct {v1, v2, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    check-cast p1, La/i1w0;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    if-eqz p0, :cond_0

    .line 50
    .line 51
    new-instance v0, La/kf50;

    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    invoke-direct {v0, p0, v2, v1, v3}, La/kf50;-><init>(La/m7h0;ZZB)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
