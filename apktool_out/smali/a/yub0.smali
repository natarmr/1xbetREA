.class public final La/yub0;
.super La/vx9;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/tu9;

.field public final synthetic b:La/j0a;


# direct methods
.method public constructor <init>(La/tu9;La/j0a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/yub0;->a:La/tu9;

    .line 5
    .line 6
    iput-object p2, p0, La/yub0;->b:La/j0a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(ILa/cy9;)V
    .locals 0

    .line 1
    iget-object p1, p0, La/yub0;->a:La/tu9;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-virtual {p1, p2}, La/tu9;->b(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/yub0;->b:La/j0a;

    .line 8
    .line 9
    check-cast p1, La/n0a;

    .line 10
    .line 11
    invoke-interface {p1, p0}, La/n0a;->f(La/vx9;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
