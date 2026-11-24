.class public abstract La/qbw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/iix0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/iix0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/qbw0;->a:La/iix0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(La/cmt0;La/whx0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public b()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public c()Ljava/util/Set;
    .locals 0

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method
