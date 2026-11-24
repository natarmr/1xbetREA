.class public final La/akh0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/us00;

.field public final b:Ljava/lang/String;

.field public final c:La/n0o0;


# direct methods
.method public constructor <init>(La/us00;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/akh0;->a:La/us00;

    .line 8
    .line 9
    const-string p1, "SECRET_SHARED_PREFERENCES"

    .line 10
    .line 11
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, La/akh0;->b:Ljava/lang/String;

    .line 16
    .line 17
    new-instance p1, La/a7g0;

    .line 18
    .line 19
    const/16 p2, 0x14

    .line 20
    .line 21
    invoke-direct {p1, p0, p2}, La/a7g0;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, La/akh0;->c:La/n0o0;

    .line 29
    .line 30
    return-void
.end method
