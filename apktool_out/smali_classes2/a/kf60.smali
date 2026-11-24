.class public final La/kf60;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/jw20;

.field public final b:La/n0o0;

.field public volatile c:La/a8z;

.field public final d:La/n0o0;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/jw20;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/kf60;->a:La/jw20;

    .line 5
    .line 6
    new-instance v0, La/sz2;

    .line 7
    .line 8
    const/16 v1, 0x11

    .line 9
    .line 10
    invoke-direct {v0, p0, v1}, La/sz2;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/kf60;->b:La/n0o0;

    .line 18
    .line 19
    iget-object v0, p1, La/jw20;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, La/wut0;

    .line 22
    .line 23
    iget-object v0, v0, La/wut0;->i:La/a8z;

    .line 24
    .line 25
    iput-object v0, p0, La/kf60;->c:La/a8z;

    .line 26
    .line 27
    sget-object v0, La/w7f;->o:La/w7f;

    .line 28
    .line 29
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, La/kf60;->d:La/n0o0;

    .line 34
    .line 35
    iget-object p1, p1, La/jw20;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, La/wut0;

    .line 38
    .line 39
    iget-object p1, p1, La/wut0;->q:Lkotlin/jvm/functions/Function0;

    .line 40
    .line 41
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Ljava/lang/String;

    .line 46
    .line 47
    iput-object p1, p0, La/kf60;->e:Ljava/lang/String;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/kf60;->a:La/jw20;

    .line 2
    .line 3
    iget-object v0, v0, La/jw20;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/wut0;

    .line 6
    .line 7
    iget-object v0, v0, La/wut0;->g:La/gsj;

    .line 8
    .line 9
    iget-object p0, p0, La/kf60;->d:La/n0o0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, La/rnh0;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, La/rnh0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "[SET CREDENTIALS IN API] "

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const/4 p1, 0x0

    .line 28
    sget-object v1, La/vv00;->b:La/vv00;

    .line 29
    .line 30
    invoke-virtual {v0, v1, p0, p1}, La/gsj;->b(La/vv00;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
