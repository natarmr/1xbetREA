.class public final La/hg60;
.super La/ef50;
.source "SourceFile"


# instance fields
.field public final c:La/ye50;


# direct methods
.method public constructor <init>(La/jg60;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ye50;

    .line 5
    .line 6
    new-instance v1, La/viq;

    .line 7
    .line 8
    const/16 v2, 0x1a

    .line 9
    .line 10
    invoke-direct {v1, p1, v2}, La/viq;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-direct {v0, p1, v1}, La/ye50;-><init>(La/ye50;La/viq;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, La/ye50;->b(La/ef50;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/hg60;->c:La/ye50;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final c(Z)V
    .locals 0

    .line 1
    return-void
.end method
