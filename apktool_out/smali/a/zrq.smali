.class public final La/zrq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/psn;

.field public b:Z

.field public final c:La/muj;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(La/psn;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, La/zrq;->b:Z

    .line 6
    .line 7
    new-instance v0, La/muj;

    .line 8
    .line 9
    invoke-direct {v0}, La/muj;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/zrq;->c:La/muj;

    .line 13
    .line 14
    iput-object p1, p0, La/zrq;->a:La/psn;

    .line 15
    .line 16
    return-void
.end method
