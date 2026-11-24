.class public final La/q950;
.super La/r8x;
.source "SourceFile"


# instance fields
.field public final b:Landroid/content/Intent;

.field public final c:La/wic;


# direct methods
.method public constructor <init>(Landroid/content/Intent;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/q950;->b:Landroid/content/Intent;

    .line 5
    .line 6
    new-instance p1, La/h70;

    .line 7
    .line 8
    invoke-direct {p1, p2}, La/h70;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, La/wic;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-direct {p2, p0, p1, v0}, La/wic;-><init>(La/r8x;La/uw00;B)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, La/q950;->c:La/wic;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final K()La/bsr0;
    .locals 0

    .line 1
    iget-object p0, p0, La/q950;->c:La/wic;

    .line 2
    .line 3
    return-object p0
.end method

.method public final P()La/vw00;
    .locals 0

    .line 1
    sget-object p0, La/vw00;->a:La/vw00;

    .line 2
    .line 3
    return-object p0
.end method
