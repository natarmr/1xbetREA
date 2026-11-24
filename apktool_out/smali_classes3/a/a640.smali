.class public abstract La/a640;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/xrt0;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/xrt0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/a640;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, La/a640;->b:La/xrt0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Date;
.end method

.method public abstract b()I
.end method

.method public c()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/a640;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract d()La/x640;
.end method

.method public e()La/xrt0;
    .locals 0

    .line 1
    iget-object p0, p0, La/a640;->b:La/xrt0;

    .line 2
    .line 3
    return-object p0
.end method
