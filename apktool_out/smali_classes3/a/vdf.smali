.class public final La/vdf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/vby;

.field public final b:Ljava/lang/String;

.field public final c:La/n0o0;


# direct methods
.method public constructor <init>(La/vby;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/vdf;->a:La/vby;

    .line 5
    .line 6
    iput-object p2, p0, La/vdf;->b:Ljava/lang/String;

    .line 7
    .line 8
    new-instance p1, La/jwd;

    .line 9
    .line 10
    const/16 p2, 0x10

    .line 11
    .line 12
    invoke-direct {p1, p0, p2}, La/jwd;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, La/vdf;->c:La/n0o0;

    .line 20
    .line 21
    return-void
.end method
