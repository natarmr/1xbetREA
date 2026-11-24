.class public final La/pew;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:J


# instance fields
.field public final a:La/svu;

.field public final b:La/mew;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/wen;->b:La/uen;

    .line 2
    .line 3
    const/16 v0, 0xa

    .line 4
    .line 5
    sget-object v1, La/bfn;->f:La/bfn;

    .line 6
    .line 7
    invoke-static {v0, v1}, La/ibc;->v0(ILa/bfn;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    sput-wide v0, La/pew;->c:J

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/svu;La/mew;)V
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
    iput-object p1, p0, La/pew;->a:La/svu;

    .line 8
    .line 9
    iput-object p2, p0, La/pew;->b:La/mew;

    .line 10
    .line 11
    return-void
.end method
