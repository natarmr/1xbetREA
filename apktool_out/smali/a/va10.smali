.class public final synthetic La/va10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ab10;


# instance fields
.field public final synthetic a:La/bb10;

.field public final synthetic b:La/tky;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:La/zn00;


# direct methods
.method public synthetic constructor <init>(La/bb10;La/tky;Ljava/lang/Object;La/zn00;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/va10;->a:La/bb10;

    iput-object p2, p0, La/va10;->b:La/tky;

    iput-object p3, p0, La/va10;->c:Ljava/lang/Object;

    iput-object p4, p0, La/va10;->d:La/zn00;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, La/va10;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, La/va10;->d:La/zn00;

    .line 4
    .line 5
    iget-object v2, p0, La/va10;->a:La/bb10;

    .line 6
    .line 7
    iget-object p0, p0, La/va10;->b:La/tky;

    .line 8
    .line 9
    invoke-virtual {v2, p0, v0, v1}, La/bb10;->a(La/tky;Ljava/lang/Object;La/zn00;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
