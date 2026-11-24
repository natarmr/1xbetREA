.class public final synthetic La/nlo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sg00;
.implements La/wzn0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILa/ly90;La/ly90;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/nlo;->a:I

    iput-object p2, p0, La/nlo;->b:Ljava/lang/Object;

    iput-object p3, p0, La/nlo;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/wdu;La/q55;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/nlo;->b:Ljava/lang/Object;

    iput-object p2, p0, La/nlo;->c:Ljava/lang/Object;

    iput p3, p0, La/nlo;->a:I

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/nlo;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ly90;

    .line 4
    .line 5
    iget-object v1, p0, La/nlo;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/ly90;

    .line 8
    .line 9
    check-cast p1, La/ky90;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget p0, p0, La/nlo;->a:I

    .line 15
    .line 16
    invoke-interface {p1, p0, v0, v1}, La/ky90;->u(ILa/ly90;La/ly90;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public k()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, La/nlo;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/wdu;

    .line 4
    .line 5
    iget-object v1, p0, La/nlo;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/q55;

    .line 8
    .line 9
    iget-object v0, v0, La/wdu;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/y3v;

    .line 12
    .line 13
    iget p0, p0, La/nlo;->a:I

    .line 14
    .line 15
    add-int/lit8 p0, p0, 0x1

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, p0, v2}, La/y3v;->v(La/q55;IZ)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method
