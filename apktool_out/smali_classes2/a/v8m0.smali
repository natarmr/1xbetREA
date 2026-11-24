.class public final La/v8m0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:La/v8m0;

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;


# instance fields
.field public final a:La/h03;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/v8m0;

    .line 2
    .line 3
    invoke-direct {v0}, La/v8m0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/v8m0;->b:La/v8m0;

    .line 7
    .line 8
    const-string v0, "1.6.99"

    .line 9
    .line 10
    sput-object v0, La/v8m0;->c:Ljava/lang/String;

    .line 11
    .line 12
    const-class v0, La/h03;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, La/v8m0;->d:Ljava/lang/String;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/h03;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, La/h03;-><init>(B)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/v8m0;->a:La/h03;

    .line 11
    .line 12
    return-void
.end method
