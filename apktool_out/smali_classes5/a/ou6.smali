.class public final La/ou6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/zdg0;

.field public final b:La/art;

.field public final c:La/sj3;

.field public final d:La/fu6;


# direct methods
.method public constructor <init>(La/zdg0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/art;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/ou6;->b:La/art;

    .line 10
    .line 11
    iput-object p1, p0, La/ou6;->a:La/zdg0;

    .line 12
    .line 13
    new-instance p1, La/sj3;

    .line 14
    .line 15
    invoke-direct {p1, p0}, La/sj3;-><init>(La/ou6;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/ou6;->c:La/sj3;

    .line 19
    .line 20
    new-instance p1, La/fu6;

    .line 21
    .line 22
    invoke-direct {p1, p0}, La/fu6;-><init>(La/ou6;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/ou6;->d:La/fu6;

    .line 26
    .line 27
    return-void
.end method
