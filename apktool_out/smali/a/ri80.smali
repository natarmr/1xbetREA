.class public final La/ri80;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/k050;

.field public final b:La/ti80;


# direct methods
.method public constructor <init>(La/el80;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/k050;

    .line 5
    .line 6
    invoke-direct {v0}, La/k050;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/ri80;->a:La/k050;

    .line 10
    .line 11
    new-instance v0, La/ti80;

    .line 12
    .line 13
    invoke-direct {v0, p1}, La/ti80;-><init>(La/el80;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/ri80;->b:La/ti80;

    .line 17
    .line 18
    return-void
.end method
