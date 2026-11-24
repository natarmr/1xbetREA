.class public abstract La/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ar20;

.field public final b:I

.field public final c:I

.field public d:La/zkd;


# direct methods
.method public constructor <init>(La/ar20;II)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/j;->a:La/ar20;

    .line 8
    .line 9
    iput p2, p0, La/j;->b:I

    .line 10
    .line 11
    iput p3, p0, La/j;->c:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, La/fiz;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method
