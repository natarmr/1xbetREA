.class public final La/ru90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/dg80;


# instance fields
.field public a:La/uj30;

.field public final b:La/c810;

.field public final c:La/xlw;


# direct methods
.method public constructor <init>(La/uj30;La/c810;La/xlw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ru90;->a:La/uj30;

    .line 5
    .line 6
    iput-object p2, p0, La/ru90;->b:La/c810;

    .line 7
    .line 8
    iput-object p3, p0, La/ru90;->c:La/xlw;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final h0()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/ru90;->b:La/c810;

    .line 2
    .line 3
    invoke-virtual {p0}, La/c810;->I0()La/j6z;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, La/j6z;->h()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
