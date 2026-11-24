.class public final La/jfi0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/twz;


# direct methods
.method public constructor <init>(La/twz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jfi0;->a:La/twz;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/ace0;La/bnn0;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, La/hac;

    .line 2
    .line 3
    sget-object v1, La/wen;->b:La/uen;

    .line 4
    .line 5
    iget-object p0, p0, La/jfi0;->a:La/twz;

    .line 6
    .line 7
    iget-object v1, p0, La/twz;->c:La/kwz;

    .line 8
    .line 9
    iget-wide v1, v1, La/kwz;->b:J

    .line 10
    .line 11
    sget-object v3, La/bfn;->d:La/bfn;

    .line 12
    .line 13
    invoke-static {v1, v2, v3}, La/ibc;->w0(JLa/bfn;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    sget-object v3, La/bfn;->e:La/bfn;

    .line 18
    .line 19
    invoke-static {v1, v2, v3}, La/wen;->l(JLa/bfn;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    const/4 v3, 0x2

    .line 24
    invoke-direct {v0, v1, v2, p1, v3}, La/hac;-><init>(JLjava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0, p2}, La/twz;->b(La/hac;La/zje;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object p1, La/wne;->a:La/wne;

    .line 32
    .line 33
    if-ne p0, p1, :cond_0

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0
.end method
