.class public final synthetic La/is70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/UnaryOperator;


# instance fields
.field public final synthetic a:Z


# direct methods
.method public synthetic constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/is70;->a:Z

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, La/ks70;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, La/ks70;->a:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v0, La/ks70;

    .line 9
    .line 10
    iget-boolean p0, p0, La/is70;->a:Z

    .line 11
    .line 12
    invoke-direct {v0, p1, p0}, La/ks70;-><init>(Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
