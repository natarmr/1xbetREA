.class public final La/m7d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/trn;

.field public final b:La/coq0;

.field public final c:La/q8b;

.field public d:Z

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(La/trn;La/coq0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/m7d0;->a:La/trn;

    .line 5
    .line 6
    iput-object p2, p0, La/m7d0;->b:La/coq0;

    .line 7
    .line 8
    new-instance p1, La/q8b;

    .line 9
    .line 10
    const/16 p2, 0x40

    .line 11
    .line 12
    new-array v0, p2, [B

    .line 13
    .line 14
    invoke-direct {p1, v0, p2}, La/q8b;-><init>([BI)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/m7d0;->c:La/q8b;

    .line 18
    .line 19
    return-void
.end method
