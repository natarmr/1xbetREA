.class public final La/sfk0;
.super La/wdx;
.source "SourceFile"


# instance fields
.field public final a:La/nz40;


# direct methods
.method public constructor <init>(La/nz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/sfk0;->a:La/nz40;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final L()V
    .locals 1

    .line 1
    iget-object p0, p0, La/sfk0;->a:La/nz40;

    .line 2
    .line 3
    invoke-virtual {p0}, La/nz40;->c()V

    .line 4
    .line 5
    .line 6
    new-instance p0, La/c44;

    .line 7
    .line 8
    const/16 v0, 0xe

    .line 9
    .line 10
    invoke-direct {p0, v0}, La/c44;-><init>(B)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method
