.class public final La/uwi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/w5z;

.field public final b:La/n5d0;


# direct methods
.method public constructor <init>(La/w5z;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uwi;->a:La/w5z;

    .line 5
    .line 6
    new-instance p1, La/xvi;

    .line 7
    .line 8
    const/16 v0, 0xd

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, La/xvi;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, La/uwi;->b:La/n5d0;

    .line 18
    .line 19
    return-void
.end method
