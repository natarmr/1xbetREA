.class public final La/zkr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:La/zkr;

.field public static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/zkr;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/zkr;->a:La/zkr;

    .line 7
    .line 8
    sget-object v0, La/wen;->b:La/uen;

    .line 9
    .line 10
    const/16 v0, 0x8

    .line 11
    .line 12
    sget-object v1, La/bfn;->e:La/bfn;

    .line 13
    .line 14
    invoke-static {v0, v1}, La/ibc;->v0(ILa/bfn;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    sput-wide v0, La/zkr;->b:J

    .line 19
    .line 20
    return-void
.end method
