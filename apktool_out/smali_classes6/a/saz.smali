.class public final La/saz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vx7;


# instance fields
.field public final synthetic a:La/taz;

.field public final synthetic b:La/mie0;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(La/taz;La/mie0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/saz;->a:La/taz;

    .line 5
    .line 6
    iput-object p2, p0, La/saz;->b:La/mie0;

    .line 7
    .line 8
    iput p3, p0, La/saz;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, La/saz;->b:La/mie0;

    .line 2
    .line 3
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/paz;

    .line 6
    .line 7
    iget v1, p0, La/saz;->c:I

    .line 8
    .line 9
    iget-object p0, p0, La/saz;->a:La/taz;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, La/taz;->Z0(La/paz;I)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method
